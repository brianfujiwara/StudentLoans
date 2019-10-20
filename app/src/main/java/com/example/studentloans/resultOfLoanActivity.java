package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultOfLoanActivity extends AppCompatActivity {


    TextView amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultofloan);

        amount = findViewById(R.id.amount);

        Intent intent = getIntent();
        double k =intent.getDoubleExtra("monthly",0);

        String j = Double.toString(k);

        amount.setText(j);

    }

}
