/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class GeneradorAlumnos {
    public static ArrayList<Alumno> generar(){
        ArrayList<Alumno>alumnos=new ArrayList<Alumno>();
        Materia m1=new Materia();
        m1.setCuatrimestre(8);
        m1.setNombre("Programacion");
        Alumno a1=new Alumno();
        a1.setCuenta(131313123);
        a1.setMateria(m1);
        a1.setNombre("jhyge");
        Alumno a2=new Alumno();
        a2.setCuenta(687586);
        a2.setMateria(m1);
        a2.setNombre("uhliuh");
        Alumno a3=new Alumno();
        a3.setCuenta(897897);
        a3.setMateria(m1);
        a3.setNombre("iuwey");
        alumnos.add(a1);
         alumnos.add(a2);
          alumnos.add(a3);
          return alumnos;
    }
}
