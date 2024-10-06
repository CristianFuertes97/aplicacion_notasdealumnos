package com.uniandes.aplicacionAlumno.modelos;

public class Curso {
    // atributos
    private Alumno alumno;

    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno[] getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    private Alumno[] alumnos = new Alumno[12];

    // metodos
    public void mostrarListas(){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    public void agregarAlumno(Alumno alumno, int ubicacion){
        alumnos[ubicacion] = alumno;
    }

    public void cambiarNota(String nombre, double nota){
        for (Alumno estudiante : alumnos) {
            if(estudiante.getNombre().equals(nombre)){
                estudiante.setNota(nota);
            }
            
        }
    }

    public double calcularPromedio(){
        double suma = 0;
        for (Alumno alumno : alumnos) {
            suma += alumno.getNota();

        }
        return suma / alumnos.length;
    }

    public int numeroEstudiantesPromedioMayor(){
        int contador = 0;
        for (Alumno alumno : alumnos) {
            if(alumno.getNota() > calcularPromedio()){
                contador++;
            }
        }
        return contador;
    }

    public int cuantosPasaron(){
        int contador = 0;
        for (Alumno alumno : alumnos) {
            if(alumno.getNota() >= 3.0 ){
                contador++;
            }
        }
        return contador;
    }

    public double mayornota(){
        double nota = 0.0;
        for (Alumno alumno : alumnos) {
            if(alumno.getNota()> nota){
                nota = alumno.getNota();
            }
        }
        return nota;
    }

    public int peorNota(){
        double nota = 1.5;
        int contador = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() == nota) {
                contador++;
            }
        }
        return contador;
    }

    public Alumno mejorAlumno(){
        Alumno estudiante = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() == mayornota()) {
                estudiante = alumno;
            }
        }
        return estudiante;
    }

    public void aumentaNota(){
        for (Alumno alumno : alumnos) {
            double valor = alumno.getNota() * 0.05;
            double nuevo = alumno.getNota() + valor;
            alumno.setNota(nuevo);
            if(alumno.getNota() > 5.0){
                alumno.setNota(5.0);
            }
        }
    }

    public int rangoConMasNotas(){
        int contador1 = 0;       
        int contador2 = 0;       
        int contador3 = 0;  
        int valor = 0;     
        for (Alumno alumno : alumnos) {
            if(alumno.getNota()>=0.0 && alumno.getNota()<=1.99){
                contador1++;
            }
            else if(alumno.getNota()>=2.0 && alumno.getNota()<=3.49){
                contador2++;
            }
            else if(alumno.getNota()>=3.5 && alumno.getNota()<=5.0){
                contador3++;
            }
        }
        if (contador1 > contador2 && contador1 > contador3) {
            valor = 1;
        }else if (contador2 > contador1 && contador2 > contador3){
            valor = 2;
        }else if (contador3 > contador2 && contador3 > contador1){
            valor = 3;
        }
        return valor;
    }

    public void subirNotas(){
        int contador = 1;
        for (Alumno alumno : alumnos) {
            if(alumno.getNota() == 1.5 && contador <= 3 ){
                alumno.setNota(2.5);
                contador++;
            }
        }
    }

    public double masVecesAparece(){
        double notaMasVecesAparece = 0.0;
        int numeroVecesAparece = 0;
        for( int i = 0; i < alumnos.length; i++ )
        {
            double notaBuscada = alumnos[ i ].getNota();
            int contador = 0;
            for( int j = 0; j < alumnos.length; j++ )
            {
                if( alumnos[ j ].getNota() == notaBuscada )
                contador++;
                }
            if( contador > numeroVecesAparece )
                {
                notaMasVecesAparece = notaBuscada;
                numeroVecesAparece = contador;
                }
            }
        return notaMasVecesAparece;
    }
}

