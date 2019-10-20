package com.example.studentloans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.appcompat.app.AppCompatActivity;

public class tuitonActivity extends AppCompatActivity {

    private int tuition;
    private TextView tu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuiton);

        tu = findViewById(R.id.tuitionText);
    }


    public void candyMaker(View v){

        tuition = Integer.parseInt(tu.getText().toString());
        Intent intent = new Intent(this, CandyActivity.class);
        intent.putExtra("tuition",tuition);

        startActivity(intent);

    }
}
