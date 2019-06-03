package com.example.slaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;// declaration above oncreate


    EditText d;

    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialazation inside oncreate mtd
        b=findViewById(R.id.button);


        d.findViewById(R.id.editText);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "super", Toast.LENGTH_SHORT).show();
                st=d.getText().toString();
                Intent obj = new Intent(MainActivity.this,Main2Activity.class);
                obj.putExtra("nn",st);
                startActivity(obj);


            }
        });

    }

}
