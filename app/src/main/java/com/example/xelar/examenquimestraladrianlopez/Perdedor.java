package com.example.xelar.examenquimestraladrianlopez;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Perdedor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdedor);
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Perdiste :(");
        dialog.setPositiveButton("Salir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        dialog.setNegativeButton("Inicio", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent abrir1 = new Intent(Perdedor.this,MainActivity.class);
                startActivity(abrir1);
            }
        });
        dialog.show();
    }
}
