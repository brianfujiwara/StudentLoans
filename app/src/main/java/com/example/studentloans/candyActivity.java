package com.example.studentloans;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.*;

public class candyActivity extends tuitionActivity {

    RadioButton snickers;
    RadioButton sour;
    RadioButton mm;
    RadioButton nerd;
    RadioButton twinkie;


    public String theKey;
    //public double tuition;

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


    public void enterCandy(View v){
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
    //
    /*
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
     */


    private void dispEquiv(){
        //tuition = Double.parseDouble(getIntent().getStringExtra("tuition"));
        //Intent intent = getIntent();
        //tuition = intent.getDoubleExtra("tuition",0);
        textBox.setText("Your tuition is about equal to "+(Math.round((this.getTuition()/(getItemCost().get(theKey)))*100)/100.0)+" "+getItemName().get(theKey));
    }

    public void toCars(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public float tuitionToItem(float tuition, String item){
        double cost =getItemCost().get(item);

        return (float)(tuition/cost);
    }

}
