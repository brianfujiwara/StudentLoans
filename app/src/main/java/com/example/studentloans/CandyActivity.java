package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class CandyActivity extends AppCompatActivity {

    RadioGroup Rg ;
    RadioButton twinkie;
    RadioButton snicker;
    RadioButton sourpatch;
    RadioButton tom;

    private int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candy);

        Rg = findViewById(R.id.Candies);
        twinkie = findViewById(R.id.TwinkieButton);
        snicker = findViewById(R.id.SnickersButton);
        sourpatch = findViewById(R.id.sourPackButton);

    }


    public void candyAmount(View v){

        Intent intent = getIntent();

        total = intent.getIntExtra("tuition", 0);

        int jake = Rg.getCheckedRadioButtonId();

         tom =  findViewById(jake);

        if (tom == twinkie){



        }else if (tom == snicker){


        }else {


        }






    }
}
