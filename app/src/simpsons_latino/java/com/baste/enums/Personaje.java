package com.baste.enums;

import com.baste.R;

public enum Personaje {

    TODOS(R.drawable.fondo, "TODOS"),
    HOMERO(R.drawable.homer, "HOMERO"),
    MARGE(R.drawable.marge, "MARGE"),
    BART(R.drawable.bart, "BART"),
    LISA(R.drawable.lisa, "LISA"),
    CANCIONES(R.drawable.fondo, "CANCIONES"),
    RAFA(R.drawable.ralph, "RAFA"),
    LIONEL_HUTZ(R.drawable.lionel_hutz, "LIONEL HUTZ"),
    APU(R.drawable.apu, "APU"),
    BARNEY(R.drawable.barney, "BARNEY"),
    BURNS(R.drawable.burns, "BURNS"),
    LENNY(R.drawable.lenny_leonard, "LENNY"),
    ABUELO(R.drawable.abuelo, "ABUELO"),
    MOE(R.drawable.moe, "MOE"),
    FLANDERS(R.drawable.flanders, "FLANDERS"),
    SMITHER(R.drawable.smithers, "SMITHER"),
    MILHOUSE(R.drawable.milhouse, "MILHOUSE"),
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