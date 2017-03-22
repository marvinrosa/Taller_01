package com.example.marvi.taller_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    private EditText cajaNomb,cajaSegundoNomb,cajaPrimerApell,cajaSegundoApell,cajaEdad, cajaSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaNomb = (EditText)findViewById(R.id.txtPrimerNombre);
        cajaSegundoNomb = (EditText)findViewById(R.id.txtSegundoNombre);
        cajaPrimerApell = (EditText)findViewById(R.id.txtPrimerApellido);
        cajaSegundoApell= (EditText)findViewById(R.id.txtSegundoApellido);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);

    }



}
