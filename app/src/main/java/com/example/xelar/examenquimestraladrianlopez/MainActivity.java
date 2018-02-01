package com.example.xelar.examenquimestraladrianlopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button ent,sal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ent=(Button)findViewById(R.id.entrar);
        ent.setOnClickListener(this);
        sal=(Button)findViewById(R.id.salir);
        sal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.entrar:
                Intent abrir = new Intent(MainActivity.this,Pantalla2.class);
                startActivity(abrir);

            break;
            case R.id.salir:

                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


            break;

        }

    }
}
