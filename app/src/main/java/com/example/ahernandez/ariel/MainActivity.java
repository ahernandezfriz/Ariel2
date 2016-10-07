package com.example.ahernandez.ariel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button ir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ir = (Button)findViewById(R.id.btn_enviar);

        ir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent in = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(in);
            }
        });

    }
}
