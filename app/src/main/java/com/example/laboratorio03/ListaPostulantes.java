package com.example.laboratorio03;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPostulantes implements Serializable {
    private ArrayList<Postulante> lista;

    public ListaPostulantes(){
        lista=new ArrayList<Postulante>();
    }

    public void añadirPostulante(String name,String apellidoM,String apellidoP,String fechaN,String carrera,String colegioP,int dni){
        lista.add(new Postulante(name,apellidoM,apellidoP,fechaN,carrera,colegioP,dni));
    }
    public Postulante buscarPorDni(int dni){
        Postulante datos=null;
        for (Postulante aux:lista) {
            if(aux.getDni()==dni){
                datos=aux;
                break;
            }
        }
        return datos;
    }
}
