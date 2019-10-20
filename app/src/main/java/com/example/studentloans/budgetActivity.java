package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;


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
//takes loan amount / (12 * yearsToRepay)
    public void moneyForLoansPerMonth(View v){

        //money owed a string, years to repay loan a string too
        String moneyOwed_string = loanAmount.getText().toString();
        String yearsTilFreedom_string = yearsToRepay.getText().toString();

        moneyOwed_double = Double.parseDouble(moneyOwed_string); //money owed now a double
        yearsTilFreedom_double = Double.parseDouble(yearsTilFreedom_string); //years to repay loan now a double

        //calculation for money to pay for loans each month to pay off loan completely
        moneyToPayForLoansEachMonth = moneyOwed_double/(12 * yearsTilFreedom_double);
        //*convert this to string to print it?
    }
}
