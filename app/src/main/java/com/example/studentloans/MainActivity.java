package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void hey(View v){
        System.out.print("hey");
    }
}

//this is a comment hello