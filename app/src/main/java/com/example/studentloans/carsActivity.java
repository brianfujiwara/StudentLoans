package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class carsActivity extends AppCompatActivity {

    //private String confirm;

    public String theKey;
    public double tuition;
    private HashMap<String, Float> itemCost;

    private TextView tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        setHashVals();

        tb = findViewById(R.id.textView5);
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

    private void dispEquiv(){
        //tuition = Double.parseDouble(getIntent().getStringExtra("tuition"));


        Intent intent = getIntent();
        tuition = intent.getDoubleExtra("tuition",0);
        tb.setText("Your tuition is about equal to "+tuition+". Your item is a "+theKey);
        //tb.setText("Your tuition is about equal to "+(Math.round(tuition/(itemCost.get(theKey))))+" "+theKey);
    }

    /*
    public void hondaCivic(RadioButton v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void chevySilverado(RadioButton v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void rollsRoyceGhost(RadioButton v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void BMW(RadioButton v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

     */

    public void enterCars(View v) {
        boolean checked = ((RadioButton) v).isChecked();
        String clicked = " ";
            switch (v.getId()) {
                case R.id.radioButton12:
                    if (checked)
                        theKey = "honda";
                    break;
                case R.id.radioButton13:
                    if (checked)
                        theKey = "chevy";
                    break;
                case R.id.radioButton14:
                    if (checked)
                        theKey = "rolls";
                    break;
                case R.id.radioButton15:
                    if (checked)
                        theKey = "bmw";

            }

            this.dispEquiv();
    }
}
