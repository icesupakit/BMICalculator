package com.example.bmicalculator;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by icesupakit on 10/23/2016.
 */

public class BmiCal extends  MainActivity{


    public  String getBMI() {
        Intent intent = getIntent();
        String Weight  =  intent.getStringExtra("Weight");
        String Height =  intent.getStringExtra("Height");

         Double  sum = Double.parseDouble(Weight)/Double.parseDouble(Height)*Double.parseDouble(Height);
        String BMI = sum+"";


        return BMI;
    }
}
