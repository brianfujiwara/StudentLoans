package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import java.util.*;

import static java.lang.Double.parseDouble;

//takes in loan amount, # of years to repay, and chosen job
public class budgetActivity  extends AppCompatActivity {

    private TextView loanAmount;
    private TextView yearsToRepay;

    public double moneyOwed_double;
    public double yearsTilFreedom_double;
    public double moneyToPayForLoansEachMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

         loanAmount= findViewById(R.id.loanAmount);
         yearsToRepay = findViewById(R.id.yearsToRepay);
    }

//    drop-down menu with top 10 most common jobs for college graduates, which are stored in a hash map
//    Hashmap for (jobs, incomes)
    public void setJobHashVals() {
        HashMap<String, Float> incomes = new HashMap<String, Float>();

        incomes.put("Data Analyst", 60000.00f);
        incomes.put("Account Manager", 50000.00f);
        incomes.put("Research Assistant", 28855.00f);
        incomes.put("Financial Analyst", 59300.00f);
        incomes.put("Sales Associate", 38000.00f);
        incomes.put("Case Manager", 60000.00f);
        incomes.put("Social Media Manager", 44000.00f);
        incomes.put("Teaching Assistant", 20000.00f);
        incomes.put("Software Engineer", 90000.00f);
        incomes.put("Administrative Assistant", 40000.00f);
    }


//takes loan amount / (12 * yearsToRepay)
    public void moneyForLoansPerMonth(View v){

        //money owed a string, years to repay loan a string too
        String moneyOwed_string = loanAmount.getText().toString();
        String yearsTilFreedom_string = yearsToRepay.getText().toString();

        moneyOwed_double = parseDouble(moneyOwed_string); //money owed now a double
        yearsTilFreedom_double = parseDouble(yearsTilFreedom_string); //years to repay loan now a double

        //calculation for money to pay for loans each month to pay off loan completely
        moneyToPayForLoansEachMonth = moneyOwed_double/(12 * yearsTilFreedom_double);


        //*convert this to string to print it?

        Intent intent = new Intent(this, resultOfLoanActivity.class);
        intent.putExtra("loan",moneyOwed_double);
        intent.putExtra("years",yearsTilFreedom_double);
        intent.putExtra("monthly", moneyToPayForLoansEachMonth);
        startActivity(intent);
    }


}
