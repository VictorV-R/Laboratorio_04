package com.example.laboratorio03;

public class Usuario {
    private String nombre,contraseña;

    public Usuario(String nombre,String contraseña){
        this.nombre=nombre;
        this.contraseña=contraseña;
    }
    public boolean comparar(String name,String pass){
        return nombre.equals(name) && contraseña.equals(pass);
    }
}
