package com.example.studentloans;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.*;

import static java.lang.Double.parseDouble;

//takes in loan amount, # of years to repay, and chosen job
public class budgetActivity  extends AppCompatActivity {

    private TextView loanAmount;
    private TextView yearsToRepay;

    RadioButton da;
    RadioButton am;
    RadioButton ra;
    RadioButton fa;
    RadioButton sa;
    RadioButton cm;
    RadioButton smm;
    RadioButton ta;
    RadioButton se;
    RadioButton aa;

    public static double moneyOwed_double;
    public static double yearsTilFreedom_double;
    public static double moneyToPayForLoansEachMonth;

    public static double getLoan(){return moneyOwed_double;}
    public static double getYears(){return yearsTilFreedom_double;}
    public static double getMonthlyDebt(){return moneyToPayForLoansEachMonth;}

    public static String theKey;
    public static String getCareerKey(){return theKey;}
    public static Double getIncome(){return (double)incomes.get(theKey);}

    public void enterCareer(View v){
        if(da.isChecked())
            theKey = "da";
        else if(am.isChecked())
            theKey = "am";
        else if(ra.isChecked())
            theKey = "ra";
        else if(fa.isChecked())
            theKey = "fa";
        else if(sa.isChecked())
            theKey = "sa";
        else if(cm.isChecked())
            theKey = "cm";
        else if(smm.isChecked())
            theKey = "smm";
        else if(ta.isChecked())
            theKey = "ta";
        else if(se.isChecked())
            theKey = "se";
        else
            theKey = "aa";
    }


    public static HashMap<String, Double> rentPrice;
    public static HashMap<String, Double> getRentPrice(){return rentPrice;}

    public static HashMap<String, Double> foodPrice;
    public static HashMap<String, Double> getFoodPrice(){return rentPrice;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

         loanAmount= findViewById(R.id.loanAmount);
         yearsToRepay = findViewById(R.id.yearsToRepay);

         //instantiate career clickers
         da = findViewById(R.id.da);
        am = findViewById(R.id.am);
        ra = findViewById(R.id.ra);
        fa = findViewById(R.id.fa);
        sa = findViewById(R.id.sa);
        cm = findViewById(R.id.cm);
        smm = findViewById(R.id.smm);
        ta = findViewById(R.id.ta);
        se = findViewById(R.id.se);
        aa = findViewById(R.id.aa);

        this.setHashVals();
    }


    public static HashMap<String,Float> incomes;
    public static HashMap<String, Float> getIncomes(){return incomes;}

    //    drop-down menu with top 10 most common jobs for college graduates, which are stored in a hash map
//    Hashmap for (jobs, incomes)
    public void setHashVals() {
        incomes = new HashMap<String, Float>();

        incomes.put("da", 60000.00f);
        incomes.put("am", 50000.00f);
        incomes.put("ra", 28855.00f);
        incomes.put("fa", 59300.00f);
        incomes.put("sa", 38000.00f);
        incomes.put("cm", 60000.00f);
        incomes.put("smm", 44000.00f);
        incomes.put("ta", 20000.00f);
        incomes.put("se", 90000.00f);
        incomes.put("aa", 40000.00f);

        rentPrice = new HashMap<String,Double>();

        //instantiate rent
        rentPrice.put("Studio", 100.0);
        rentPrice.put("One bedroom", 200.0);
        rentPrice.put("Two bedroom", 300.0);
        rentPrice.put("Three bedroom", 400.0);

        foodPrice = new HashMap<String,Double>();

        //instantiate rent
        foodPrice.put("Thrifty", 100.0);
        foodPrice.put("Low", 200.0);
        foodPrice.put("Moderate", 300.0);
        foodPrice.put("Liberal", 400.0);
    }


//takes loan amount / (12 * yearsToRepay)
    public void moneyForLoansPerMonth(View v) {

        //money owed a string, years to repay loan a string too
        String moneyOwed_string = loanAmount.getText().toString();
        String yearsTilFreedom_string = yearsToRepay.getText().toString();

        moneyOwed_double = parseDouble(moneyOwed_string); //money owed now a double
        yearsTilFreedom_double = parseDouble(yearsTilFreedom_string); //years to repay loan now a double

        //calculation for money to pay for loans each month to pay off loan completely
        moneyToPayForLoansEachMonth = moneyOwed_double / (12 * yearsTilFreedom_double);

        Intent intent = new Intent(this, resultOfLoanActivity.class);
        startActivity(intent);
        //*convert this to string to print it?
        /*

        intent.putExtra("loan",moneyOwed_double);
        intent.putExtra("years",yearsTilFreedom_double);
        intent.putExtra("monthly", moneyToPayForLoansEachMonth);

         */
    }


}
