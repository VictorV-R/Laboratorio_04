package com.example.laboratorio03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        EditText dniP=findViewById(R.id.inputDNIR);
        EditText apellidoPaterno =findViewById(R.id.inputApellidoP);
        EditText apellidoMaterno =findViewById(R.id.inputApellidoM);
        EditText nombres =findViewById(R.id.inputNombres);
        EditText fechaNacimiento =findViewById(R.id.inputFechaNacimiento);
        EditText codigoProcedencia =findViewById(R.id.inputColegio);
        EditText carreraPostular =findViewById(R.id.inputCarrera);
        Button registrarEstudiante=findViewById(R.id.buttonRegistrar);

        Button registrarP=findViewById(R.id.buttonRegistrar);
        Button regresar= findViewById(R.id.buttonRegresar);

        registrarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Obtenemos
                String DNI = dniP.getText().toString();
                String apellidoP = apellidoPaterno.getText().toString();
                String apellidoM =apellidoMaterno.getText().toString();
                String nombre =nombres.getText().toString();
                String fechaN =fechaNacimiento.getText().toString();
                String codigoP =codigoProcedencia.getText().toString();
                String carreraP =carreraPostular.getText().toString();

                String datos="";

                //Comprueba los campos
                if(!comprobarCampos(DNI,apellidoP,apellidoM,nombre,fechaN,codigoP,carreraP)) {
                    datos=nombre+":"+apellidoM+":"+apellidoP+":"+fechaN+":"+carreraP+":"+codigoP+":"+DNI;
                    //Intent
                    Intent intentMenu = new Intent();
                    intentMenu.putExtra("datos",datos);
                    setResult(Activity.RESULT_OK,intentMenu);
                    finish();
                }
            }
        });
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public static boolean comprobarCampos(String dni,String aP,String aM,String nom,String fech,String cod,String carr){
        boolean vacio=false;
        vacio= aP.isEmpty() || aM.isEmpty() || nom.isEmpty() || fech.isEmpty() || cod.isEmpty() || carr.isEmpty();
        return vacio;
    }
}