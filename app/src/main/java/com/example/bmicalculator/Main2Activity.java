package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView v1 = (TextView) findViewById(R.id.textView2);
        TextView v2 = (TextView) findViewById(R.id.textView4);

        BmiCal  b  = new BmiCal();

        Double bmi = Double.parseDouble(b.getBMI());

        Intent intent = getIntent();
        String str = intent.getStringExtra("BMI");

        if (bmi <18.5){

            v1.setText((b.getBMI()));
            v2.setText("นําหนกัน้อยกวา่ปกติ (ผอม)");

        } else if (bmi >= 18.5 && bmi < 25 ) {
            v1.setText((b.getBMI()));
            v2.setText("น้ำหนกัปกติ ");
        }
         else if (bmi >= 25 && bmi < 30) {
        v1.setText((b.getBMI()));
        v2.setText("นําหนกัมากกวา่ปกติ (ท้วม)");
    }  else{
            v1.setText((b.getBMI()));
            v2.setText("นําหนกัมากกวา่ปกติมาก (อ้วน)");
        }

    }
}
