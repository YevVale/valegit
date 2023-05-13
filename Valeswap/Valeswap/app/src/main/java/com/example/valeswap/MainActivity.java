package com.example.valeswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText et1;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.check);
        et1 = (EditText) findViewById(R.id.text1);
        et2 = (EditText) findViewById(R.id.text2);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), messagenew.class);
                String one = et1.getText().toString();
                String two = et2.getText().toString();
                if (one.equalsIgnoreCase(two)){
                    i.putExtra("same","THE SAME");
                    startActivity(i);
                } else{
                    i.putExtra("same","NOT THE SAME");
                    startActivity(i);
                }
            }
        });
    }
    public void onSwap (View view){
        et1 = (EditText) findViewById(R.id.text1);
        et2 = (EditText) findViewById(R.id.text2);
        String getFirstString = String.valueOf(et1.getText());
        String getSecondString = String.valueOf(et2.getText());
        et1.setText(getSecondString);
        et2.setText(getFirstString);
    }
}