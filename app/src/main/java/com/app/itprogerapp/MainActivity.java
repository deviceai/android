package com.app.itprogerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText number1, number2;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("App Created");

        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                result.setText(String.valueOf(num1 + num2));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("App Started");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        System.out.println("App Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("App Paused!");
    }
}