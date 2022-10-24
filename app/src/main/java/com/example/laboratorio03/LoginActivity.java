package com.example.laboratorio03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usuarioLoginT= findViewById(R.id.inputUsuarioLogin);
        EditText contrasenaLoginT= findViewById(R.id.inputUsuarioContrasena);
        Button login= findViewById(R.id.buttonLogin);

        UsuariosLogin usuarios=new UsuariosLogin();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usuarioLoginT.getText().toString();
                String password =contrasenaLoginT.getText().toString();
                if(usuarios.login(user,password)){
                    Intent intentMenu= new Intent(getApplicationContext(),MenuActivity.class);
                    startActivity(intentMenu);
                } else {
                    Log.d("INFO","No existe el usuario");
                }
            }
        });
    }
}