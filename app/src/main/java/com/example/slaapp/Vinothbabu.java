package com.example.slaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Vinothbabu extends AppCompatActivity {
    Button b;
    EditText ed;
    TextView tv;
    String st;
    String st1;
    String st2;
    EditText ed1;
    Button b1;
    TextView tv1;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinothbabu);
        b.findViewById(R.id.button8);
        b1.findViewById(R.id.button9);
        ed.findViewById(R.id.editText2);
        ed1.findViewById(R.id.editText3);
        tv.findViewById(R.id.textView2);
        tv1.findViewById(R.id.textView2);
        tv2.findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st1=ed.getText().toString();
                tv1.setText(st1);
                st2=ed1.getText().toString();
                tv2.setText(st2);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st=ed.getText().toString();
                tv.setText(st);

            }
        });
    }
}
