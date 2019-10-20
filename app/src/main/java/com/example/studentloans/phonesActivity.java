package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class phonesActivity extends tuitionActivity {

    public String theKey;
    public double tuition;

    private TextView tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        setHashVals();

        tb = findViewById(R.id.output);
    }


    private void dispEquiv(){
        //tuition = Double.parseDouble(getIntent().getStringExtra("tuition"));


        //Intent intent = getIntent();
        //tuition = intent.getDoubleExtra("tuition",0);
        tb.setText("Your tuition is about equal to "+(Math.round((this.getTuition()/(getItemCost().get(theKey)))*100)/100.0)+" "+getItemName().get(theKey));
    }

    public void appleProMax(View v){
        Intent intent = new Intent(this, phonesActivity.class);
        startActivity(intent);
    }

    public void samsungS(View v){
        Intent intent = new Intent(this, phonesActivity.class);
        startActivity(intent);
    }

    public void enterPhones(View v) {
        boolean checked = ((RadioButton) v).isChecked();
        String clicked = " ";
        switch (v.getId()) {
            case R.id.apple:
                if (checked)
                    theKey = "apple";
                break;
            case R.id.android:
                if (checked)
                    theKey = "android";



        }

        this.dispEquiv();
    }
}