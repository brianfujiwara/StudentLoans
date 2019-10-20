package com.example.studentloans;

import android.content.Intent;
import android.view.View;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class petsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);
    }




    public void cat(View v){
        Intent intent = new Intent(this, petsActivity.class);
        startActivity(intent);
    }

    public void dog(View v){
        Intent intent = new Intent(this, petsActivity.class);
        startActivity(intent);
    }

    public void hamster(View v) {
        Intent intent = new Intent(this, petsActivity.class);
        startActivity(intent);
    }

    public void bird(View v) {
        Intent intent = new Intent(this, petsActivity.class);
        startActivity(intent);
    }

    public void bunny(View v) {
        Intent intent = new Intent(this, petsActivity.class);
        startActivity(intent);
    }



}
