package com.example.marvi.taller_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity
{

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

        if(validacion())
        {

            nomb = cajaNomb.getText().toString();
            segundoNom = cajaSegundoNomb.getText().toString();
            primerApe = cajaPrimerApell.getText().toString();
            segundoApe = cajaSegundoApell.getText().toString();
            edad = cajaEdad.getText().toString();
            sex = cajaSexo.getText().toString();

            b.putString("Nombre",nomb);
            b.putString("Segundo Nombre", segundoNom);
            b.putString("Primer Apellido",primerApe);
            b.putString("Segundo Apellido",segundoApe);
            b.putString("Edad",edad);
            b.putString("Sexo",sex);

            //Le paso al intent todos los datos en forma encapsulada con el bundle
            i.putExtras(b);
            //Arranco la actividad que le intent me diga
            startActivity(i);

        }
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

    public boolean validacion()
    {
        if(cajaNomb.getText().toString().isEmpty())
        {
            cajaNomb.setError(getResources().getString(R.string.sr_error_1));
            return false;
        }

        if(cajaSegundoNomb.getText().toString().isEmpty())
        {
            cajaSegundoNomb.setError(getResources().getString(R.string.sr_error_2));
            return false;
        }

        if(cajaPrimerApell.getText().toString().isEmpty())
        {
            cajaPrimerApell.setError(getResources().getString(R.string.sr_error_3));
            return false;
        }

        if(cajaSegundoApell.getText().toString().isEmpty())
        {
            cajaSegundoApell.setError(getResources().getString(R.string.sr_error_4));
            return false;
        }

        if(cajaEdad.getText().toString().isEmpty())
        {
            cajaEdad.setError(getResources().getString(R.string.sr_error_5));
            return false;
        }
        if(cajaSexo.getText().toString().isEmpty())
        {
            cajaSexo.setError(getResources().getString(R.string.sr_error_6));
            return false;
        }

        return true;
    }


}
