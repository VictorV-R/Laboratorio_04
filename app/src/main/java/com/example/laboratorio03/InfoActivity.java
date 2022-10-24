package com.example.laboratorio03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        EditText infoBuscarDni= findViewById(R.id.inputDNI);
        Button buscarPorDNI= findViewById(R.id.buttonBuscarDNI);

        buscarPorDNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent
                ListaPostulantes aux=(ListaPostulantes) getIntent().getSerializableExtra("listaPostulantes");
                Postulante postulante=aux.buscarPorDni(Integer.parseInt(infoBuscarDni.getText().toString()));
                if(postulante!=null) {
                    TextView showDNI = findViewById(R.id.textDNI);
                    showDNI.setText(postulante.getDni()+"");
                    TextView showNombre = findViewById(R.id.textNombre);
                    showNombre.setText(postulante.getNombre());
                    TextView showApeP = findViewById(R.id.textApellidoP);
                    showApeP.setText(postulante.getApellidoP());
                    TextView showApeM = findViewById(R.id.textApellidoM);
                    showApeM.setText(postulante.getApellidoM());
                    TextView showFechaN = findViewById(R.id.textfechaN);
                    showFechaN.setText(postulante.getFechaN());
                    TextView showCarrera = findViewById(R.id.textCarrera);
                    showCarrera.setText(postulante.getCarrera());
                    TextView showColegio = findViewById(R.id.textColegio);
                    showColegio.setText(postulante.getColegio());
                } else {
                    Log.d("INFO","No encontrado");
                }
            }
        });
        Button regresar= findViewById(R.id.buttonReturn);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}