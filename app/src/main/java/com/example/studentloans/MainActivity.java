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



    public void tuition(View v){ //moves to next page
        Intent intent = new Intent(this, tuitionActivity.class);
        startActivity(intent);
    }

    public void budget(View v){ //moves to next page
        Intent intent = new Intent(this, budgetActivity.class);
        startActivity(intent);
    }
    //Hashmap for (food/rent, costs)
//    public static void (String[] args) {
//        HashMap<String, Float> lifestyle = new HashMap<String, Float>();
//
//        // Add keys and values (Food, Costs)
//        lifestyle.put("thrifty_groceries", 176.10f);
//        lifestyle.put("low-cost_groceries", 225.15f);
//        lifestyle.put("moderate_groceries", 279.05f);
//        lifestyle.put("liberal", 348.95f);
//        //System.out.println(lifestyle);
//
//        //Add keys and values (Rent, Costs)
//        lifestyle.put("studio", 927.00f);
//        lifestyle.put("1br", 1076.00f);
//        lifestyle.put("2br", 1265.00f);
//        lifestyle.put("3br", 1618.00f);
        //*add single family??


        //drop-down menu with top 10 most common jobs for college graduates, which are stored in a hash map
        //Hashmap for (jobs, incomes)
//    public static void(String[]args){
//            HashMap<String, Float> incomes = new Hashmap<String, Float>();
//
//            incomes.put("Data Analyst", 60000.00);
//            incomes.put("Account Manager", 50000.00);
//            incomes.put("Research Assistant", 28855.00);
//            incomes.put("Financial Analyst", 59300.00);
//            incomes.put("Sales Associate", 38000.00);
//            incomes.put("Case Manager", 60000.00);
//            incomes.put("Social Media Manager", 44000.00);
//            incomes.put("Teaching Assistant", 20000.00);
//            incomes.put("Software Engineer", 90000.00);
//            incomes.put("Administrative Assistant", 40000.00);
//
    }

    //public static int
    //enter number of years they want to pay it off in
    //choose among most common careers:

    //next screen:
    //scrolldown screen with food and rent
    //select one of the option:

    //public

