package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class carsActivity extends AppCompatActivity {

    //private String confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
    }



    public void hondaCivic(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void chevySilverado(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void rollsRoyceGhost(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public void BMW(View v){
        Intent intent = new Intent(this, carsActivity.class);
        startActivity(intent);
    }

    public static String enterCars(View v) {
        boolean checked = v.isChecked();
        String clicked = " ";
            switch (v.getId()) {
                case R.id.radioButton12:
                    if (checked)
                        clicked = "Honda Civic";
                    break;
                case R.id.radioButton13:
                    if (checked)
                        clicked = "Chevy Silverado";
                    break;
                case R.id.radioButton14:
                    if (checked)
                        clicked = "Rolls Royce Ghost";
                    break;
                case R.id.radioButton15:
                    if (checked)
                        clicked = "BMW 4";

            }
        return clicked;

    }
}
