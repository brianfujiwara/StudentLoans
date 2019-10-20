package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class carsActivity extends tuitionActivity {

    //private String confirm;

    public String theKey;
    public double tuition;

    private TextView tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        setHashVals();

        tb = findViewById(R.id.textView5);
    }

    private void dispEquiv(){
        //tuition = Double.parseDouble(getIntent().getStringExtra("tuition"));


        //Intent intent = getIntent();
        //tuition = intent.getDoubleExtra("tuition",0);
        tb.setText("Your tuition is about equal to "+(Math.round((this.getTuition()/(getItemCost().get(theKey)))*100)/100.0)+" "+getItemName().get(theKey));
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
