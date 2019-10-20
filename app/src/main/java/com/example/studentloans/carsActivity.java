package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class carsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
    }



    public void hondaCivic(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void chevySilverado(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void rollsRoyceGhost(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void BMW(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }
}
