package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;


import android.os.Bundle;

import java.util.*;

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

    public static void main(String[] args) {
        HashMap<String, Float> lifestyle = new HashMap<String, Float>();

        // Add keys and values (Food, Costs)
        lifestyle.put("thrifty_groceries", 176.10f);
        lifestyle.put("low-cost_groceries", 225.15f);
        lifestyle.put("moderate_groceries", 279.05f);
        lifestyle.put("liberal", 348.95f);
        System.out.println(lifestyle);

        //Add keys and values (Rent, Costs)
        lifestyle.put("studio", 927.00f);
        lifestyle.put("1br", 1076.00f);
        lifestyle.put("2br", 1265.00f);
        lifestyle.put("3br", 1618.00f);
        //*add single family??

    }
}