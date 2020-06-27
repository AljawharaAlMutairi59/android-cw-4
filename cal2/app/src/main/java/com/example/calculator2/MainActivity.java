package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1 = findViewById(R.id.editText1);
        final EditText num2 = findViewById(R.id.editText2);
        final Button aa = findViewById(R.id.button);
        final Button bb = findViewById(R.id.button2);

        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String x = num1.getText().toString();
                String y = num2.getText().toString();
                int n1 =Integer.parseInt(x);
                int n2 =Integer.parseInt(y);

                int result =n1+n2;
                Toast.makeText(MainActivity.this,"the addition is : "+result,Toast.LENGTH_LONG.).show();

            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = num1.getText().toString();
                String y = num2.getText().toString();
                int n1 =Integer.parseInt(x);
                int n2 =Integer.parseInt(y);

                int result =n1-n2;
                Toast.makeText(MainActivity.this,"the addition is : "+result,Toast.LENGTH_LONG.).show();



            }
        });


    }
}