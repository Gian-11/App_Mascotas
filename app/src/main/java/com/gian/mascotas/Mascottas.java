package com.gian.mascotas;

public class Mascottas {
    private String nombre;
    private int foto;
    private int rating;

    public Mascottas(String nombre, int foto, int rating) {
        this.nombre = nombre;
        this.foto = foto;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
