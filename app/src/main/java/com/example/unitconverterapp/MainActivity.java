package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView t,t1,t2;
EditText e;

Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t=findViewById(R.id.textView4);
         t1=findViewById(R.id.textView5);
         t2=findViewById(R.id.textView6);

         e=findViewById(R.id.e1);
         b=findViewById(R.id.button);
         b.setOnClickListener(new View.OnClickListener() {
             @Override

             public void onClick(View view) {

                 if(!e.getText().toString().equals("")) {
                     String s = e.getText().toString();
                     double km=Double.parseDouble(s);
                     double m=1000*km;
                     double l=100*m;
                     double k=10*l;
                     t.setText(m + " m ");
                     t1.setText(l + " cm ");
                     t2.setText(k + " mm ");
                     e.setText("");
             }
             else{
                 Toast.makeText(getApplicationContext(),"invalid input",Toast.LENGTH_SHORT).show();
                     t.setText("");
                     t2.setText("");
                     t1.setText("");}
             }
         });

    }
    }