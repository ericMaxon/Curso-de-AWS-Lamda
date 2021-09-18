package com.aprendiendo.aws.handler.dto;

public class Shoe {
    private int id;
    private String Nombre;

    public Shoe(int _id, String _Nombre) {
        id = _id;
        Nombre = _Nombre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "id=" + id +
                "name=" + Nombre+
                '}';
    }
}
