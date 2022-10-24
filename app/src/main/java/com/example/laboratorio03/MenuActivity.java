package com.example.laboratorio03;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    private ListaPostulantes listaPostulantes;
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        String usuarioARegistrar=data.getStringExtra("datos");
                        Log.d("INFO",usuarioARegistrar);
                        String datos[]=usuarioARegistrar.split(":");
                        listaPostulantes.añadirPostulante(datos[0],datos[1],datos[2]
                        ,datos[3],datos[4],datos[5],Integer.parseInt(datos[6]));
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        listaPostulantes=new ListaPostulantes();
        listaPostulantes.añadirPostulante("Alberto","Rojas","Vilca","11/11/2001","Sistemas","Example",777);

        Button registrar= findViewById(R.id.buttonRegistrarP);
        Button info= findViewById(R.id.buttonInfoP);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistrar=new Intent(getApplicationContext(),RegistrarActivity.class);
                mStartForResult.launch(intentRegistrar);
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