package com.uniandes.aplicacionAlumno.principal;


import com.uniandes.aplicacionAlumno.modelos.Alumno;
import com.uniandes.aplicacionAlumno.modelos.Curso;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Creacion de los estudiantes 
        var alumno1 = new Alumno("Cristian", 4.5);
        var alumno2 = new Alumno("Maria", 2.7);
        var alumno3 = new Alumno("Joaquin", 1.5);
        var alumno4 = new Alumno("Maylo", 3.5);
        var alumno5 = new Alumno("Julio", 3.0);
        var alumno6 = new Alumno("Paty", 1.5);
        var alumno7 = new Alumno("Luis", 0.8);
        var alumno8 = new Alumno("Mario", 1.5);
        var alumno9 = new Alumno("Lina", 2.1);
        var alumno10 = new Alumno("Marta", 3.5);
        var alumno11 = new Alumno("Carlos", 1.5);
        var alumno12 = new Alumno("Wendy", 2.0);
        
        // creacion del curso
        var sextoA = new Curso();
        
        // agregamos los estudiantes al curso
        sextoA.agregarAlumno(alumno1, 0);
        sextoA.agregarAlumno(alumno2, 1);
        sextoA.agregarAlumno(alumno3, 2);
        sextoA.agregarAlumno(alumno4, 3);
        sextoA.agregarAlumno(alumno5, 4);
        sextoA.agregarAlumno(alumno6, 5);
        sextoA.agregarAlumno(alumno7,6);
        sextoA.agregarAlumno(alumno8, 7);
        sextoA.agregarAlumno(alumno9, 8);
        sextoA.agregarAlumno(alumno10, 9);
        sextoA.agregarAlumno(alumno11, 10);
        sextoA.agregarAlumno(alumno12, 11);

        // mostramos la lista del curso sextoA
        System.out.println("Lista de estudiantes");
        sextoA.mostrarListas();
        System.out.println("******************");
        System.out.println("Promedio de notas de los estudiantes: "+(float)sextoA.calcularPromedio());
        System.out.println("Total de estudiantes con promedio superior : "+sextoA.numeroEstudiantesPromedioMayor());
        System.out.println("Total de estudiantes que pasaron la materia : "+sextoA.cuantosPasaron());
        System.out.println("La mayor nota del curso : "+sextoA.mayornota());
        System.out.println("Total de personas que sacaron 1.5 : "+sextoA.peorNota());
        System.out.println("El mejor estudiante : "+sextoA.mejorAlumno());
        System.out.println("rango con mas notas : "+sextoA.rangoConMasNotas());
        System.out.println("******************");
        System.out.println("Nota mas repetida: "+sextoA.masVecesAparece());
        
    }  
}
