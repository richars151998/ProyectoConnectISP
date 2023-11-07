package com.miempresa.connectisp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ListaUsuarios extends AppCompatActivity {

    EditText TxtCodigo, TxtNombre, TxtDireccion, TxtBarrio;
    Button BtnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);


        TxtCodigo=findViewById(R.id.TxtCodigo);
        TxtNombre=findViewById(R.id.TxtNombre);
        TxtDireccion=findViewById(R.id.TxtDireccion);
        TxtBarrio=findViewById(R.id.TxtBarrio);
        BtnGuardar = findViewById(R.id.BtnGuardar);

        BtnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           // long id=  DbUsuarios dbUsuarios = new DbUsusarios(ListaUsuarios.this);
             /*  DbUsuarios.isertarUsuarios(TxtCodigo.getText().toString(),
                                          TxtNombre.getText().toString(),
                                          TxtDireccion.getText().toString(),
                                          TxtBarrio.getText().toString());*/

             /*   if(id>0 ){
                    Toast.makeText(ListaUsuarios.this, "REGISTRO GUARDADO",
                                    Toast.LENGTH_LONG).show();
                    Limpiar();
                }else { Toast.makeText(ListaUsuarios.this, "ERROR AL GUARDAR REGISTRO",
                        Toast.LENGTH_LONG).show();
                }*/
            }
        });

    }
    private void Limpiar (){
        TxtNombre.setText ( " " ) ;
        TxtCodigo.setText ( " " ) ;
        TxtDireccion.setText( " ") ;
        TxtBarrio.setText(" ");
    }
}