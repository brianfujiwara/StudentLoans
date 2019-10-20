package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class phonesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);
    }




    public void appleProMax(View v){
        Intent intent = new Intent(this, phonesActivity.class);
        startActivity(intent);
    }

    public void samsungS(View v){
        Intent intent = new Intent(this, phonesActivity.class);
        startActivity(intent);
    }
}