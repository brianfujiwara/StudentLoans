package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class petsActivity extends tuitionActivity {

    public String theKey;
    public double tuition;

    private TextView tb;
    private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);

        setHashVals();

        tb = findViewById(R.id.output);
        im = findViewById(R.id.imageView);

    }

    private void dispEquiv(){
        //tuition = Double.parseDouble(getIntent().getStringExtra("tuition"));


        //Intent intent = getIntent();
        //tuition = intent.getDoubleExtra("tuition",0);
        tb.setText("Your tuition is about equal to "+(Math.round((this.getTuition()/(getItemCost().get(theKey)))*100)/100.0)+" "+getItemName().get(theKey));
    }


//    public void cat(View v){
//        Intent intent = new Intent(this, petsActivity.class);
//        startActivity(intent);
//    }
//
//    public void dog(View v){
//        Intent intent = new Intent(this, petsActivity.class);
//        startActivity(intent);
//    }
//
//    public void hamster(View v) {
//        Intent intent = new Intent(this, petsActivity.class);
//        startActivity(intent);
//    }
//
//    public void bird(View v) {
//        Intent intent = new Intent(this, petsActivity.class);
//        startActivity(intent);
//    }
//
//    public void bunny(View v) {
//        Intent intent = new Intent(this, petsActivity.class);
//        startActivity(intent);
//    }

    public void enterPets(View v) {

        boolean checked = ((RadioButton) v).isChecked();
        String clicked = " ";
        switch (v.getId()) {
            case R.id.rabbit:
                if (checked){
                    theKey = "rabbit";
                    im.setImageResource(R.drawable.rabbit);
                }
                break;
            case R.id.bird:
                if (checked) {
                    theKey = "bird";
                    im.setImageResource(R.drawable.bird);
                }
                break;
            case R.id.cat:
                if (checked) {
                    theKey = "cat";
                    im.setImageResource(R.drawable.cat);
                }
                break;
            case R.id.hamster:
                if (checked) {
                    theKey = "hamster";
                    im.setImageResource(R.drawable.hamster);
                }
                break;
            case R.id.dog:
                if (checked) {
                    theKey = "dog";
                    im.setImageResource(R.drawable.dog);
                }


        }

        this.dispEquiv();
    }

    public void toPhones(View v){
        Intent intent = new Intent(this, phonesActivity.class);
        startActivity(intent);
    }

}
