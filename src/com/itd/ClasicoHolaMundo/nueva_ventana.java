package com.itd.ClasicoHolaMundo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * User: rober
 * Date: 24/09/13
 * Time: 06:35 PM
 * Agregar la descripción del archivo
 */
public class nueva_ventana extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nueva_ventana);
        TextView texto = (TextView)findViewById(R.id.txtNuevoMensaje);
        Bundle aqui_se_reciben_los_parametros = getIntent().getExtras();
String valor = aqui_se_reciben_los_parametros.getString("Asi_se_llama_el_parametro");
        texto.setText(valor);
    }
}
