package com.baste;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.baste.fragments.FavoritosFragment;
import com.baste.fragments.InfoFragment;
import com.baste.fragments.TodosFragment;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class MainActivity extends ActionBarActivity {

    public static SharedPreferences prefs;
    static boolean conectado = false;
    private static ProgressDialog progressDialog;
    private boolean salir = false;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        new LoadTask().execute();
        salir = false;
    }

    private void newVersionsLoad() {
        setContentView(R.layout.activity_main);

        // Buscar AdView como recurso y cargar una solicitud.
        AdView adView = (AdView) findViewById(R.id.adView);
        if (isPackageInstalled("com.baste.lqsa.pro", this)) {
            adView.setVisibility(View.GONE);
        }
        else {
            adView.loadAd(new AdRequest.Builder().build());
        }

        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();

        // Specify that the Home/Up button should not be enabled, since there is no hierarchical
        // parent.
//        actionBar.setHomeButtonEnabled(false);

        // Specify that we will be displaying tabs in the action bar.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        String[] titles = getResources().getStringArray(R.array.titles);
        // For each of the sections in the app, add a tab to the action bar.
        for (String title : titles) {
            // Create a tab with text corresponding to the page title defined by the adapter.
            // Also specify this Activity object, which implements the TabListener interface, as the
            // listener for when this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(title)
                            .setTabListener(new TabListener() {

                                @Override
                                public void onTabUnselected(Tab tab, FragmentTransaction ft) {
                                }

                                @Override
                                public void onTabSelected(Tab tab, FragmentTransaction ft) {
                                    replaceFragment(tab.getPosition());
                                }

                                @Override
                                public void onTabReselected(Tab tab, FragmentTransaction ft) {
                                }
                            })
            );
        }

        String fav = prefs.getString("fav", "");
        if (fav.equals(""))
            actionBar.setSelectedNavigationItem(0);
        else
            actionBar.setSelectedNavigationItem(1);
        progressDialog.dismiss();
        if (conectado)
            buscarActualizacion();
    }

    private void replaceFragment(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new TodosFragment();
                break;
            case 1:
                fragment = new FavoritosFragment();
                break;
            case 2:
                fragment = new InfoFragment();
                break;
        }

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commitAllowingStateLoss();
        }
    }

    @Override
    public void onBackPressed() {
        if (!salir) {
            salir = true;
            Toast.makeText(this, "Pulse otra ver para salir",
                    Toast.LENGTH_SHORT).show();
        } else {
            if (MainActivity.prefs.getInt("VersionCode", 0) < getVersion()) {
                SharedPreferences.Editor editor = MainActivity.prefs.edit();
                editor.putBoolean("nuevos", false);
                editor.putInt("VersionCode", getVersion());
                editor.apply();
            }
            if (Utiles.getMediaPlayer().isPlaying())
                Utiles.getMediaPlayer().stop();
            finish();
        }
    }

    private class LoadTask extends AsyncTask<Void, Void, Void> {

        private LoadTask() {
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage(getString(R.string.cargando));
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            UtilesSonidos.sonidos();
            iniciarListaFav();
            conectado = Utiles.checkConex(MainActivity.this);
            if (prefs.getInt("VersionCode", 0) < getVersion()) {
                SharedPreferences.Editor editor = prefs.edit();
//                MyListAdapter.vnuevos = true;
                editor.remove("nuevos");
                editor.apply();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            newVersionsLoad();
        }
    }

    private int getVersion() {
        int version = -1;
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(
                    getPackageName(), PackageManager.GET_META_DATA);
            version = pInfo.versionCode;
        } catch (NameNotFoundException e1) {
            Log.e(this.getClass().getSimpleName(), "Name not found", e1);
        }
        return version;
    }

    private void iniciarListaFav() {
        if (Utiles.getListaFavoritos().isEmpty()) {
            String fav = prefs.getString("fav", "");
            String data[] = fav.split("-");
            for (String ss : data) {
                for (Sonido so : UtilesSonidos.getListaTodos())
                    if (so.getNombre().equals(ss))
                        Utiles.getListaFavoritos().add(so);
            }
        }
    }

    @SuppressLint("UseValueOf")
    private void buscarActualizacion() {
        Runnable showWaitDialog = new Runnable() {
            public void run() {
                try {
                    URL oracle = new URL(BuildConfig.UPDATE_URL);
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(oracle.openStream()));
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        String[] rowfields = inputLine.split("--");
                        if (new Integer(rowfields[0]) > getVersion()) {
                            alertDialogActualizacion(rowfields[1],
                                    rowfields[2], MainActivity.this);
                        }
                    }
                    in.close();
                } catch (IOException e) {
                    // e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(showWaitDialog);
        t.start();
    }

    private void alertDialogActualizacion(String text, final String url, final Activity mActivity) {
        final AlertDialog.Builder alt_bld = new AlertDialog.Builder(mActivity);
        alt_bld.setCancelable(true);
        alt_bld.setIcon(android.R.drawable.ic_dialog_alert);
        alt_bld.setTitle("Mensaje");
        alt_bld.setMessage(text);
        alt_bld.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent i = new Intent("android.intent.action.VIEW", Uri
                        .parse(url));
                mActivity.startActivity(i);
            }
        });
        mActivity.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog alert = alt_bld.create();
                alert.show();
            }
        });
    }

    // Menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent ii = new Intent(MainActivity.this, AjustesActivity.class);
                startActivityForResult(ii, 1000);
                return true;
            case R.id.action_search:
                onSearchRequested();
                return true;
            case R.id.action_share:
                String s = "He estado usando "
                        + getResources().getString(R.string.app_name)
                        + " y creo que te gustará. Pruébalo en tu Android: "
                        + "http://market.android.com/details?id="
                        + getPackageName();
                Intent it = new Intent(Intent.ACTION_SEND);
                it.putExtra(Intent.EXTRA_TEXT, s);
                it.setType("text/plain");
                startActivity(Intent.createChooser(it, "Compartir aplicación"));
                return true;
            case R.id.action_random:
                Sonido so = UtilesSonidos.getListaTodos().get((int) (Math.random()
                        * UtilesSonidos.getListaTodos().size() + 0));
                Utiles.reproducir(getApplicationContext(), so);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.container);
        if (fragment != null) {
            fragment.onActivityResult(requestCode, resultCode, data);
        }
    }

    private boolean isPackageInstalled(String packagename, Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packagename, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
