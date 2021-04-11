    package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;
    public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button Add,Sub,Mul,Div;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv = findViewById(R.id.tv);
        Add = findViewById(R.id.Add);
        Sub = findViewById(R.id.Sub);
        Mul = findViewById(R.id.Mul);
        Div = findViewById(R.id.Div);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f= Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());

                a = f+s;
                tv.setText("Result is "+a);


            }

        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f= Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());

                a = f-s;
                tv.setText("Result is "+a);


            }

        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f= Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());

                a = f*s;
                tv.setText("Result is "+a);


            }

        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f= Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                if (s != 0) {
                    a = f / s;
                    tv.setText("Result is "+a);
                }
                else
                    tv.setText("Invaild");


            }

        });



    }
}