package com.baste.enums;

import com.baste.R;

public enum Personaje {

    TODOS(R.drawable.fondo, "TODOS"),
    ANTONIO_RECIO(R.drawable.antonio_recio, "Antonio Recio"),
    AMADOR(R.drawable.amador_rivas, "Amador"),
    ESTELA(R.drawable.estela_reynols, "Estela Reynolds"),
    COQUE(R.drawable.coque, "Coque"),
    MAXI(R.drawable.maxi, "Maxi"),
    ENRIQUE(R.drawable.enrique, "Enrique"),
    VICENTE(R.drawable.vicente, "Vicente"),
    IZASKUN(R.drawable.izaskun, "Izaskun"),
    NINES(R.drawable.nines, "Nines"),
    LEO(R.drawable.leo, "Leo"),
    BERTA(R.drawable.berta, "Berta"),
    JAVIER(R.drawable.javi_maroto, "Javier"),
    JUDITH(R.drawable.judith, "Judith"),
    MAITE(R.drawable.maite, "Maite"),
    CARLOTA(R.drawable.carlota, "Carlota"),
    JUSTI(R.drawable.justi, "Justi"),
    ARACELI(R.drawable.araceli, "Araceli"),
    VIOLETA(R.drawable.violeta_recio, "Violeta"),
    FERMIN(R.drawable.fermin_trujillo, "Fermín"),
    OTROS(R.drawable.fondo, "Otros");

    private int numVal;
    private String stVal;

    private Personaje(int numVal, String stVal) {
        this.numVal = numVal;
        this.stVal = stVal;
    }

    public String getName() {
        return stVal;
    }

    public int getFondoID() {
        return numVal;
    }

    public static Personaje fromValue(String typeSt) {
        for (Personaje p : Personaje.values()) {
            if (p.stVal == typeSt)
                return p;
        }

//        throw new IllegalArgumentException("Invalid type code: " + typeSt);
        return TODOS;
    }

    public static CharSequence[] toStringArray() {
        CharSequence[] sequences = new CharSequence[values().length];
        for (int i = 0; i < values().length; i++) {
            sequences[i] = values()[i].getName();
        }
        return sequences;
    }

}