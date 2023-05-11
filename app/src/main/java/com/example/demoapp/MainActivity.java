package com.example.demoapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnLoginIngreso;
    EditText edtLoginEmail, edtLoginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referenciaViews();
    }

    private void validarDatos(String mail, String password) {
        if(mail.equals("jose@correo.com") && password.equals("1234")){
            Toast.makeText(this, "ACCESO CORRECTO", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, HomeActivity.class);

            // intent.putExtra("EXTRA_EMAIL", "");

            startActivity(intent);

        }else{
            Toast.makeText(this, "Datos Invalidos", Toast.LENGTH_SHORT).show();
        }
    }

    private void referenciaViews() {
        btnLoginIngreso = findViewById(R.id.btnLoginIngreso);
        edtLoginEmail = findViewById(R.id.edtLoginEmail);
        edtLoginPassword = findViewById(R.id.edtLoginPassword);

        btnLoginIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarDatos(edtLoginEmail.getText().toString(), edtLoginPassword.getText().toString());
            }
        });
    }
}