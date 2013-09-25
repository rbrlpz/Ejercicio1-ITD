package com.itd.ClasicoHolaMundo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnEnviar = (Button)findViewById(R.id.btnEnviar);
        final TextView texto = (TextView)findViewById(R.id.textView);
        final EditText mensaje = (EditText)findViewById(R.id.txtMensaje);

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){
                Intent intent = new Intent(MyActivity.this, nueva_ventana.class);
                Bundle cosas_a_enviar = new Bundle();
                cosas_a_enviar.putString("Asi_se_llama_el_parametro",mensaje.getText().toString());
                intent.putExtras(cosas_a_enviar);
                startActivity(intent);
            }
        });

    }
}
