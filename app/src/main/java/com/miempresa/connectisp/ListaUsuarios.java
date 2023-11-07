package com.miempresa.connectisp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ListaUsuarios extends AppCompatActivity {

    EditText TxtCodigo, TxtNombre, TxtDireccion, TxtBarrio;
    Button BtnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);
    }
}