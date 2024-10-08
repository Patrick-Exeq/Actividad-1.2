package com.pat.miapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
// Autores: Patrick Segovia - Rick Gonzales
public class MainActivity extends AppCompatActivity {

    private EditText etDatos;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDatos = findViewById(R.id.etDatos);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String datos = etDatos.getText().toString();
                enviarDatos(datos);
            }
        });
    }
    // Método para enviar los datos a la segunda Activity
    private void enviarDatos(String datos) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("clave_datos", datos);
        startActivity(intent);
    }

}