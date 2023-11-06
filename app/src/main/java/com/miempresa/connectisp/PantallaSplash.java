package com.miempresa.connectisp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_splash);

        // Se agrega el código para causar el efecto de espera para la pantalla Splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Se invoca la Activity en memoria
                // 1er parámetro el nombre de la clase para la Actitivy del Splash
                // 2do parámetro la siguiente Activity que se mostrará después del Splash
                Intent ActivitySplash = new Intent(PantallaSplash.this, Registro.class);
                startActivity(ActivitySplash);
                finish();
            }
        }, 5000); // La pantalla Splash se mostrará por 5 segundos
    }
}