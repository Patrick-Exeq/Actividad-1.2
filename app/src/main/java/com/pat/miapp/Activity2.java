package com.pat.miapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvResultado = findViewById(R.id.tvResultado);

        // Obtener los datos del Intent
        String datosRecibidos = getIntent().getStringExtra("clave_datos");

        if (datosRecibidos != null) {
            // Mostrar los datos en el TextView
            tvResultado.setText(datosRecibidos);

            // Mostrar los datos en un Toast
            Toast.makeText(this, "Datos recibidos: " + datosRecibidos, Toast.LENGTH_LONG).show();
        }
    }
}
