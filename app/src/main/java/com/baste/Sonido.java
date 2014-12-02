package com.baste;

import com.baste.enums.Personaje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sonido {

	private String nombre;
	private int archivo;
	private List<Personaje> mPersonajes;
	private boolean nuevo;
    private String videoUrl;
	
	public Sonido(String nombre, int archivo, Personaje... personajes) {
		this.nombre = nombre;
		this.archivo = archivo;

        mPersonajes = new ArrayList<Personaje>();
        Collections.addAll(mPersonajes, personajes);
	}

	public String getNombre() {
		return nombre;
	}

	public int getArchivo() {
		return archivo;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public Sonido setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
		return this;
	}
	
	public Sonido addPersonaje(Personaje personaje) {
        mPersonajes.add(personaje);
		return this;
	}
	
	public boolean contains(Personaje personaje) {
		return mPersonajes.contains(personaje);
	}

    public Sonido setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}

