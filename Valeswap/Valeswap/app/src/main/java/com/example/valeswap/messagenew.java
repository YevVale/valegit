package com.example.valeswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class messagenew extends AppCompatActivity {

    TextView o;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messagenew);
        Intent acttwo = getIntent();
        o = (TextView) findViewById(R.id.output);
        String result = acttwo.getStringExtra("same");
        o.setText(result);


    }
}