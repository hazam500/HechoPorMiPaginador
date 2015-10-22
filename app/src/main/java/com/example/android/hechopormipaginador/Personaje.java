package com.example.android.hechopormipaginador;

/**
 * Created by TOSHIBA on 21/10/2015.
 */
public class Personaje {

    private String nombre;
    private String url;

    public Personaje(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;

    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }
}
