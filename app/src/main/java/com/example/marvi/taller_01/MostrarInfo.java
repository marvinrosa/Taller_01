package com.example.marvi.taller_01;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarInfo extends AppCompatActivity {

    private TextView mostrarMensaje;
    String aux,nomb ="",segundoNom="",primerApe ="",segundoApe="",eda="",sex="";
    private Resources res;
    private Bundle b;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);

        mostrarMensaje = (TextView)findViewById(R.id.lblMostrar_Info);
        nomb = b.getString("Nombre");
        segundoNom = b.getString("Segundo Nombre");
        primerApe = b.getString("Primer Apellido");
        segundoApe = b.getString("Segundo Apellido");
        eda = b.getString("Edad");
        sex = b.getString("Sexo");
        res = this.getResources();


        aux = res.getString(R.string.sr_hola)+""+ nomb + ""+ segundoNom +""+ primerApe+ ""+ segundoApe + ""+ res.getString(R.string.sr_tu)+""+ eda + ""+ sex ;

        mostrarMensaje.setText(aux);
    }
}
