package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import java.util.*;

public class tuitionActivity extends AppCompatActivity{

    private TextView tuit;
    public double tuition;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuition);

        tuit = findViewById(R.id.tuit);
    }

    public void putTuition(View v){
        String tuitiontest = tuit.getText().toString();


        tuition = Double.parseDouble(tuitiontest);
        Double testMath = tuition/30;

    }

}
