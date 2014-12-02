package com.baste;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Utiles {

    private static List<Sonido> favoritos = new ArrayList<Sonido>();
    static MediaPlayer mp = new MediaPlayer();
    private static String nombre = BuildConfig.FOLDER_NAME;
    private final static String PATH = android.os.Environment
            .getExternalStorageDirectory() + "/" + nombre + "/";

    public static List<Sonido> getListaFavoritos() {
        return favoritos;
    }

    private static Sonido anterior;
    private static boolean sonido = false;

    public static void reproducir(Context cont, Sonido s) {
        if (s.equals(anterior) && sonido && mp.isPlaying()) {
            mp.stop();
            sonido = false;
        } else {
            anterior = s;
            sonido = true;
            if (mp != null)
                mp.reset();
            try {
                AssetFileDescriptor afd = cont.getResources()
                        .openRawResourceFd(s.getArchivo());
                mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(),
                        afd.getLength());
                mp.prepare();
                mp.start();
            } catch (NotFoundException e) {
                Toast.makeText(cont, "Upsss, algo ha ido mal :(",
                        Toast.LENGTH_SHORT).show();
            } catch (IllegalStateException e) {
                // Log.i("Reproducir", e.getMessage());
            } catch (IOException e) {
                // Log.e("Reproducir", e.getMessage());
            }
        }
    }

    public static MediaPlayer getMediaPlayer() {
        return mp;
    }

    public static boolean saveAsRingtone(String s, Context mContext) {
        File k = new File(PATH + limpiarString(s) + ".mp3");

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, limpiarString(s));
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "cssounds ");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
        values.put(MediaStore.Audio.Media.IS_ALARM, false);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        // Insert it into the database
        Uri newUri = mContext.getContentResolver()
                .insert(MediaStore.Audio.Media.getContentUriForPath(k
                        .getAbsolutePath()), values);

        RingtoneManager.setActualDefaultRingtoneUri(mContext,
                RingtoneManager.TYPE_RINGTONE, newUri);
        return true;
    }

    public static boolean saveAsNotification(String s, Context mContext) {
        File k = new File(PATH + limpiarString(s) + ".mp3");

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, limpiarString(s));
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "cssounds ");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
        values.put(MediaStore.Audio.Media.IS_ALARM, false);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        // Insert it into the database
        Uri newUri = mContext.getContentResolver()
                .insert(MediaStore.Audio.Media.getContentUriForPath(k
                        .getAbsolutePath()), values);

        RingtoneManager.setActualDefaultRingtoneUri(mContext,
                RingtoneManager.TYPE_NOTIFICATION, newUri);
        return true;
    }

    public static boolean saveAsAlarm(String s, Context mContext) {
        File k = new File(PATH + limpiarString(s) + ".mp3");

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, limpiarString(s));
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "cssounds ");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
        values.put(MediaStore.Audio.Media.IS_ALARM, true);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        // Insert it into the database
        Uri newUri = mContext.getContentResolver()
                .insert(MediaStore.Audio.Media.getContentUriForPath(k
                        .getAbsolutePath()), values);

        RingtoneManager.setActualDefaultRingtoneUri(mContext,
                RingtoneManager.TYPE_ALARM, newUri);
        return true;
    }

    public static boolean save(Sonido s, Context mContext) {
        byte[] buffer;
        InputStream fIn = mContext.getResources().openRawResource(
                s.getArchivo());
        int size;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {
            return false;
        }

        String filename = limpiarString(s.getNombre()) + ".mp3";

        boolean exists = (new File(PATH)).exists();
        if (!exists) {
            new File(PATH).mkdirs();
            nomedia(mContext);
        }

        FileOutputStream save;
        try {
            save = new FileOutputStream(PATH + filename);
            save.write(buffer);
            save.flush();
            save.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }

        mContext.sendBroadcast(new Intent(
                Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://"
                + PATH + filename)
        ));
        return true;
    }

    public static void nomedia(Context mContext) {
        byte[] buffer = null;
        InputStream fIn = mContext.getResources()
                .openRawResource(R.raw.nomedia);
        int size;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {
        }
        String filename = ".nomedia";

        FileOutputStream save;
        try {
            save = new FileOutputStream(PATH + filename);
            save.write(buffer);
            save.flush();
            save.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        mContext.sendBroadcast(new Intent(
                Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://"
                + PATH + filename)
        ));

        new File(PATH, filename);
    }

    public static void subMenu(final Sonido aux, final Context mContext) {
        final CharSequence[] items = {"Asignar como...", "Compartir...",
                "Copiar a SD"};

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                if (item == 0) {
                    asignarComo(aux, mContext);
                } else if (item == 1 && compartir(aux, mContext)) {
                } else if (item == 2 && save(aux, mContext)) {
                    Toast.makeText(mContext, "Copiado en: '" + nombre + "'",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext, "Upsss, algo ha ido mal :(",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.setTitle(aux.getNombre());
        alert.show();
    }

    public static boolean compartir(Sonido s, Context mContext) {
        save(s, mContext);
        Intent it = new Intent(Intent.ACTION_SEND);
        it.putExtra(
                Intent.EXTRA_STREAM,
                Uri.parse("file://" + PATH + limpiarString(s.getNombre())
                        + ".mp3")
        );
        it.setType("audio/mp3");
        mContext.startActivity(Intent.createChooser(it, "Compartir " + s));
        return true;
    }

    public static void asignarComo(final Sonido aux, final Context mContext) {
        final CharSequence[] items = {"Tono", "Notificación", "Alarma"};

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                if (item == 0 && save(aux, mContext)
                        && Utiles.saveAsRingtone(aux.getNombre(), mContext)) {
                    Toast.makeText(mContext, "Asignado como tono",
                            Toast.LENGTH_SHORT).show();
                } else if (item == 1 && save(aux, mContext)
                        && Utiles.saveAsNotification(aux.getNombre(), mContext)) {
                    Toast.makeText(mContext, "Asignado como notificación",
                            Toast.LENGTH_SHORT).show();
                } else if (item == 2 && save(aux, mContext)
                        && Utiles.saveAsAlarm(aux.getNombre(), mContext)) {
                    Toast.makeText(mContext, "Asignado como alarma",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext, "Upsss, algo ha ido mal :(",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.setTitle(aux.getNombre());
        alert.show();
    }

    public static String limpiarString(String input) {
        // Cadena de caracteres original a sustituir.
        String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ¿?¡!º:";
        // Cadena de caracteres ASCII que reemplazarán los originales.
        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC      ";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }// for i
        return output;
    }

    public static boolean checkConex(Context mContext) {
        ConnectivityManager cm = (ConnectivityManager) mContext
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnected();
    }

}