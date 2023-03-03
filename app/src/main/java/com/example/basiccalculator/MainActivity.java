package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText num1,num2;
TextView result_view;
Double number1, number2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.First_id);
        num2 = findViewById(R.id.second_id);
        result_view = findViewById(R.id.view_result);
    }

    public void SumFunction(View view) {
        number1=Double.parseDouble(num1.getText().toString());
        number2=Double.parseDouble(num2.getText().toString());
        result=number1+number2;
        result_view.setText(""+result);

    }

    public void SubFunction(View view) {
        number1=Double.parseDouble(num1.getText().toString());
        number2=Double.parseDouble(num2.getText().toString());
        result=number1-number2;
        result_view.setText(""+result);

    }

    public void MultiFunction(View view) {
        number1=Double.parseDouble(num1.getText().toString());
        number2=Double.parseDouble(num2.getText().toString());
        result=number1*number2;
        result_view.setText(""+result);

    }

    public void DivFunction(View view) {
        number1=Double.parseDouble(num1.getText().toString());
        number2=Double.parseDouble(num2.getText().toString());
        result=number1/number2;
        result_view.setText(""+result);

    }
}