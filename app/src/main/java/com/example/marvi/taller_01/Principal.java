package com.example.marvi.taller_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    private EditText cajaNomb,cajaSegundoNomb,cajaPrimerApell,cajaSegundoApell,cajaEdad, cajaSexo;
    private Bundle b;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaNomb = (EditText)findViewById(R.id.txtPrimerNombre);
        cajaSegundoNomb = (EditText)findViewById(R.id.txtSegundoNombre);
        cajaPrimerApell = (EditText)findViewById(R.id.txtPrimerApellido);
        cajaSegundoApell= (EditText)findViewById(R.id.txtSegundoApellido);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);

        i = new Intent(this,MostrarInfo.class);
        b = new Bundle();

    }

    public void MensajeInfo(View v)
    {
        String nomb ="",segundoNom="",primerApe ="",segundoApe="",edad="",sex="";
        b.putString("Nombre",nomb);
        b.putString("Segundo Nombre", segundoNom);
        b.putString("Primer Apellido",primerApe);
        b.putString("Segundo Apellido",segundoApe);
        b.putString("Edad",edad);
        b.putString("Sexo",sex);

    }

    public void Borrar(View v)
    {

        cajaNomb.setText("");
        cajaNomb.requestFocus();
        cajaSegundoNomb.setText("");
        cajaPrimerApell.setText("");
        cajaSegundoApell.setText("");
        cajaEdad.setText("");
        cajaSexo.setText("");

    }



}
