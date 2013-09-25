package com.itd.ClasicoHolaMundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){
                    texto.setText("Pa que le puchabas juan!!!");
            }
        });

    }
}
