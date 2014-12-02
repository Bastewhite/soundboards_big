package com.baste.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.baste.BuildConfig;
import com.baste.R;
import com.baste.UtilesSonidos;

public class InfoFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.help, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textview = (TextView) view.findViewById(R.id.helpWelcome);
        String nombre = BuildConfig.FOLDER_NAME;
        textview.setText(getResources().getString(R.string.app_name)+" ofrece "+ UtilesSonidos.getListaTodos().size() + " sonidos distintos de los mejores momentos de "+ nombre +". Además de escucharlos también se ofrecen las siguientes posibilidades:\n\n" +
                "Play y Stop: Presiona una frase para escucharla, púlsala de nuevo mientras se escucha para pararlo.\n\n"
                + "Asignar como: Se puede asignar como tono, notificación o alarma el sonido que queráis mediante la pulsación larga en este.\n\n"
                + "Favoritos: Crea tu propia lista con tus sonidos favoritos fácilmente añadiendo y quitando mediante la estrella.\n\n"
                + "Buscador: Busca de manera rápida tu frase, accede al buscador desde el menú\n\n"
                + "Reproducción aleatoria: Reproduce al azar cualquiera de las frases, accede desde el menú\n\n"
                + "Compartir: Puedes enviar tus sonidos preferidos por bluetooth, correo o WhatsApp\n\n"
                + "Separación por personaje: mediante desplazamiento vertical cambia entre las listas de los personajes\n\n"
                + "Todos los sonidos son descargados en la carpeta \""+ nombre +"\" de tu tarjeta SD");

    }
}