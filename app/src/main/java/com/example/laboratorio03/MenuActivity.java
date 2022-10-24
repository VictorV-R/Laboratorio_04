package com.example.laboratorio03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ListaPostulantes listaPostulantes=new ListaPostulantes();
        listaPostulantes.añadirPostulante("a","a","a","a","a","a",777);

        Button registrar= findViewById(R.id.buttonRegistrarP);
        Button info= findViewById(R.id.buttonInfoP);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistrar=new Intent(getApplicationContext(),RegistrarActivity.class);
                startActivityForResult(intentRegistrar,2);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentInfo=new Intent(getApplicationContext(),InfoActivity.class);
                intentInfo.putExtra("listaPostulantes", listaPostulantes);
                startActivity(intentInfo);
            }
        });

    }
}