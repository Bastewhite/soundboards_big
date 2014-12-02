package com.baste.otto.events;

import com.baste.enums.Personaje;

public class SetBackEvent {
	
	private Personaje mPersonaje;

    public SetBackEvent(Personaje personaje) {
        mPersonaje = personaje;
    }

    public Personaje getPersonaje() {
        return mPersonaje;
    }
}
