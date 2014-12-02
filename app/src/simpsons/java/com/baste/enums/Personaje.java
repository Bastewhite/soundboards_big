package com.baste.enums;

import com.baste.R;

public enum Personaje {

    TODOS(R.drawable.fondo, "TODOS"),
    HOMER(R.drawable.homer, "HOMER"),
    MARGE(R.drawable.marge, "MARGE"),
    BART(R.drawable.bart, "BART"),
    LISA(R.drawable.lisa, "LISA"),
    CANCIONES(R.drawable.fondo, "CANCIONES"),
    RALPH(R.drawable.ralph, "RALPH"),
    ABUELO(R.drawable.abuelo, "ABUELO"),
    APU(R.drawable.apu, "APU"),
    BARNEY(R.drawable.barney, "BARNEY"),
    BURNS(R.drawable.burns, "BURNS"),
    DOCTOR(R.drawable.doctor_hibbert, "DOCTOR"),
    FLANDERS(R.drawable.flanders, "FLANDERS"),
    KENT(R.drawable.kent_brockman, "KENT"),
    LENNY(R.drawable.lenny_leonard, "LENNY"),
    MILHOUSE(R.drawable.milhouse, "MILHOUSE"),
    MOE(R.drawable.moe, "MOE"),
    NELSON(R.drawable.nelson, "NELSON"),
    SKINNER(R.drawable.skinner, "SKINNER"),
    SMITHER(R.drawable.smithers, "SMITHER"),
    WIGGUM(R.drawable.wiggum, "WIGGUM"),
    OTROS(R.drawable.fondo, "OTROS");

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