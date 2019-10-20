package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.*;

public class candyActivity extends AppCompatActivity {

    RadioButton snickers;
    RadioButton sour;
    RadioButton mm;
    RadioButton nerd;
    RadioButton twinkie;


    public String theKey;
    public double tuition;

    private TextView textBox;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candy2);

        setHashVals();

        snickers = findViewById(R.id.snickers);
        sour = findViewById(R.id.sourpatch);
        mm = findViewById(R.id.mm);
        nerd = findViewById(R.id.nerds);
        twinkie = findViewById(R.id.twinkies);

        textBox = findViewById(R.id.textView4);
    }


    public void madeChoice(View v){
        if(snickers.isChecked())
            theKey = "snickers";
        else if(mm.isChecked())
            theKey = "mm";
        else if(sour.isChecked())
            theKey = "sourpatch";
        else if(nerd.isChecked())
            theKey = "nerds";
        else
            theKey = "twinkies";

        this.dispEquiv();
    }


    private HashMap<String, Float> itemCost;

    private void dispEquiv(){
        //tuition = Double.parseDouble(getIntent().getStringExtra("tuition"));
        Intent intent = getIntent();
        tuition = intent.getDoubleExtra("tuition",0);
        textBox.setText("Your tuition is about equal to "+(Math.round(tuition/(itemCost.get(theKey))))+" "+theKey);
    }

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
    }

    public float tuitionToItem(float tuition, String item){
        double cost =itemCost.get(item);

        return (float)(tuition/cost);
    }

}
