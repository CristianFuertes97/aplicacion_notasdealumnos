package com.uniandes.aplicacionAlumno.modelos;

public class Alumno {
    // Atirbutos
    private String nombre;
    private double nota;

    // constructor

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // getters and setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // metodos

    @Override
    public String toString() {
        return 
            "Nombre: " + getNombre()+
            "  Nota: " + getNota();
    }

}
