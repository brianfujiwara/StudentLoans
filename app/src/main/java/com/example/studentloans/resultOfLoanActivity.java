package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultOfLoanActivity extends budgetActivity {


    TextView amount;
    TextView incomeDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultofloan);

        amount = findViewById(R.id.amount);

        incomeDis = findViewById(R.id.incomeDis);

        double monthlyin = this.getIncome();
        double monthly = this.getMonthlyDebt();

        amount.setText("Your loans will cost you $"+(Math.round((monthly*100)/100.0))+" per month.");

        incomeDis.setText("Your monthly income will be about $"+(Math.round((monthlyin*100)/1200.0))+".");

    }


    /*
    public void toRent(View v){
        Intent intent = new Intent(this, rentActivity.class);
        startActivity(intent);
    }

     */

}
