package com.example.xelar.examenquimestraladrianlopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla4 extends AppCompatActivity implements View.OnClickListener{
    Button verdadero, falso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);
        verdadero=(Button)findViewById(R.id.verd);
        verdadero.setOnClickListener(this);
        falso=(Button)findViewById(R.id.fals);
        falso.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.verd:
                Intent abrir1 = new Intent(Pantalla4.this,Perdedor.class);
                startActivity(abrir1);

                break;
            case R.id.fals:
                Intent abrir = new Intent(Pantalla4.this,Pantalla5.class);
                startActivity(abrir);

                break;


        }
    }
}
