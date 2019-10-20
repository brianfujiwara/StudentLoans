package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import java.util.*;

public class tuitionActivity extends AppCompatActivity{

    private TextView tuit;
    private static double tuition;
    private TextView textv;
    public Intent storeTuition;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuition);

        //storeTuition = new Intent(this, candyActivity.class);

        tuit = findViewById(R.id.tuit);
    }

    private static HashMap<String, Float> itemCost;
    private static HashMap<String, String> itemName;

    public void setHashVals(){
        //itemCost instantiation
        itemCost = new HashMap<String, Float>();
        //candy
        itemCost.put("snickers",3.00f);
        itemCost.put("mm",3.00f);
        itemCost.put("sourpatch",3.00f);
        itemCost.put("nerds",1.00f);
        itemCost.put("twinkies",4.00f);

        //cars
        itemCost.put("honda", 19550.00f);
        itemCost.put("chevy",28300.00f);
        itemCost.put("rolls",311900.00f);
        itemCost.put("bmw",44600.00f);

        //phones
        itemCost.put("apple", 1099.00f);
        itemCost.put("android", 999.00f);

        //pets
        itemCost.put("cat", 1070.00f);
        itemCost.put("dog", 1270.00f);
        itemCost.put("hamster",125.00f);
        itemCost.put("bird",185.00f);
        itemCost.put("rabbit",240.00f);

        //itemName instantiation
        itemName = new HashMap<String, String>();
        itemName.put("snickers","snickers");
        itemName.put("mm","M & M's");
        itemName.put("sourpatch","sour patch kids");
        itemName.put("nerds","nerds");
        itemName.put("twinkies","twinkies");

        //cars
        itemName.put("honda", "2019 Honda Civic's");
        itemName.put("chevy","2019 Chevy Silverado's");
        itemName.put("rolls","2019 Rolls Royce Ghost's");
        itemName.put("bmw","2019 BMW 4's");

        //phones
        itemName.put("apple", "");
        itemName.put("android", "");

        //pets
        itemName.put("cat", "cats for a year");
        itemName.put("dog", "dogs for a year");
        itemName.put("hamster","hamsters for a year");
        itemName.put("bird","birds for a year");
        itemName.put("rabbit","rabbits for a year");
    }

    public static HashMap<String, Float> getItemCost(){return itemCost;}
    public static HashMap<String, String> getItemName(){return itemName;}

    public void putTuition(View v){
        String tuitiontest = tuit.getText().toString();

        tuition = Double.parseDouble(tuitiontest);

        Intent intent = new Intent(this, candyActivity.class);
        startActivity(intent);
        /*
        storeTuition = new Intent(this, carsActivity.class);

        storeTuition.putExtra("tuition", tuition);
        startActivity(storeTuition);

        storeTuition = new Intent(this, candyActivity.class);

        storeTuition.putExtra("tuition", tuition);
        startActivity(storeTuition);

         */






    }

    public static double getTuition(){return tuition;}
}
