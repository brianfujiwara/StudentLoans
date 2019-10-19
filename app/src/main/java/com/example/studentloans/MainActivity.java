package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void tuition(View v){
        Intent intent = new Intent(this, tuitonActivity.class);
        startActivity(intent);
    }

    public void budget(View v){
        Intent intent = new Intent(this, budgetActivity.class);
        startActivity(intent);
    }
}
