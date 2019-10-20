package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TotalActivity extends AppCompatActivity {

    double cam;
    TextView yoga;
    String tammy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        yoga = findViewById(R.id.textView3);

        Intent intent = getIntent();

        cam = intent.getDoubleExtra("sum",0);

        // String numberAsString = new Double(cam).toString();
        tammy = Double.toString(cam);

        yoga.setText(tammy);

        //yoga.setText(String.format("you have %6d

    }



}
