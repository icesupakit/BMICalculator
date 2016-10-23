package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Button bt1 = (Button)findViewById(R.id.button1);


        final EditText edtHeight  =(EditText)findViewById(R.id.editText1);

        final EditText edtWeight =(EditText)findViewById(R.id.editText2);



       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,Main2Activity.class);
               intent.putExtra("BMI","bmi");
               intent.putExtra("Height",edtHeight.getText().toString());
               intent.putExtra("Weight",edtWeight.getText().toString());
               startActivity(intent);
           }
       });



    }
}
