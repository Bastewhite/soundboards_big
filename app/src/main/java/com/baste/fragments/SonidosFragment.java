package com.baste.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import com.baste.R;
import com.baste.Sonido;
import com.baste.Utiles;
import com.baste.UtilesSonidos;
import com.baste.adapters.MyListAdapter;
import com.baste.debug.Debugger;
import com.baste.enums.Personaje;
import com.baste.otto.BusProvider;
import com.baste.otto.events.UpdateEvent;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class SonidosFragment extends Fragment implements AbsListView.OnItemClickListener,
        AbsListView.OnItemLongClickListener {

    /**
     * The Adapter which will be used to populate the ListView/GridView with
     * Views.
     */
    private MyListAdapter mAdapter;

    public static SonidosFragment newInstance(String s) {
        SonidosFragment f = new SonidosFragment();
        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putString("date", s);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);

        updateList();
    }

    private void updateList() {
        List<Sonido> sonidos;

        String s = getArguments().getString("date");

        Personaje mPersonaje = Personaje.fromValue(s);

        if (mPersonaje == Personaje.TODOS) {
            sonidos = UtilesSonidos.getListaTodos();
        } else {
            sonidos = new ArrayList<Sonido>();
            for (Sonido so : UtilesSonidos.getListaTodos())
                if (so.contains(mPersonaje))
                    sonidos.add(so);
        }

        Debugger.info(mPersonaje.getName() + ": " + sonidos.size());

        mAdapter = new MyListAdapter(getActivity(), sonidos);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set the adapter
        // The fragment's ListView/GridView.
        AbsListView mListView = (AbsListView) view.findViewById(android.R.id.list);
        ((AdapterView<ListAdapter>) mListView).setAdapter(mAdapter);

        // Set OnItemClickListener so we can be notified on item clicks
        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Reproducir
        Utiles.reproducir(view.getContext(), mAdapter.getItem(position));
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        Vibrator vv = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
        vv.vibrate(25);
        Utiles.subMenu(mAdapter.getItem(i), getActivity());
        return false;
    }

   @Subscribe
    public void update(UpdateEvent event) {
       mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onResume() {
        super.onResume();

        BusProvider.getInstance().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();

        BusProvider.getInstance().unregister(this);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1000 && resultCode == Activity.RESULT_OK) {
            update(null);
        }
    }

}
