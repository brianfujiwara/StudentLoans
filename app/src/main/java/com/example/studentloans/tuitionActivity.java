package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import java.util.*;

public class tuitionActivity extends AppCompatActivity{

    private TextView tuit;
    public double tuition;
    private TextView textv;
    public Intent storeTuition;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuition);

        //storeTuition = new Intent(this, candyActivity.class);

        tuit = findViewById(R.id.tuit);
    }

    public void putTuition(View v){
        String tuitiontest = tuit.getText().toString();

        tuition = Double.parseDouble(tuitiontest);

        storeTuition = new Intent(this, candyActivity.class);

        storeTuition.putExtra("tuition", tuition);
        startActivity(storeTuition);

    }
}
