package com.example.laboratorio03;

import java.util.ArrayList;

public class UsuariosLogin {
    private ArrayList<Usuario> usuarios;

    public UsuariosLogin(){
        usuarios=new ArrayList<Usuario>();
        usuarios.add(new Usuario("Luis","12345"));
        usuarios.add(new Usuario("Juan","12345"));
        usuarios.add(new Usuario("Carlos","12345"));
        usuarios.add(new Usuario("Maria","12345"));
    }
    public boolean login(String user,String password){
        boolean exist=false;
        for (Usuario aux: usuarios) {
            if(aux.comparar(user,password)){
                exist=true;
                break;
            }
        }
        return exist;
    }
}
