package com.example.laboratorio03;

import java.io.Serializable;

public class Postulante implements Serializable {
    public String nombre,apellidoP,apellidoM,fechaN,carrera,colegio;
    private int dni;
    public Postulante(String nombre,String apellidoM,String apellidoP, String fechaN, String carrera, String colegio,int DNI){
        this.nombre=nombre;
        this.apellidoM=apellidoM;
        this.apellidoP=apellidoP;
        this.fechaN=fechaN;
        this.carrera=carrera;
        this.colegio=colegio;
        this.dni=DNI;
        System.out.println("Registrado");
    }

    public String toString(){
        return "Nombre: "+nombre+
                "\nApellido Paterno: "+apellidoP+
                "\nApellido Materno: "+apellidoM+
                "\nDNI: "+dni+
                "\nFecha Nacimiento: "+fechaN+
                "\nCarrera: "+carrera+
                "\nColegio Procedencia: "+colegio;
    }
    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidoP(){
        return apellidoP;
    }
    public String getApellidoM(){
        return apellidoM;
    }
    public String getFechaN(){
        return fechaN;
    }
    public String getCarrera(){
        return carrera;
    }
    public String getColegio(){
        return colegio;
    }
}
