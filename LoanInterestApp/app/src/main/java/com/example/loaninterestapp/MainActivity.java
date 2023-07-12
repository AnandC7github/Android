package com.example.loaninterestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e11,e22,e33,e44;
    Button b1;
    int loanamt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e11 = (EditText) findViewById(R.id.e1);
        e22 = (EditText) findViewById(R.id.e2);
        e33 = (EditText) findViewById(R.id.e3);
        e44 = (EditText) findViewById(R.id.e4);
    }
    public void oninterest(View v){
        String loan = e11.getText().toString();
        String interest = e22.getText().toString();
        String years = e33.getText().toString();
        if(!loan.isEmpty() && !interest.isEmpty() && !years.isEmpty()){
            float loan1 = Float.parseFloat(loan);
            float interest1= Float.parseFloat(interest);
            float years1 = Integer.parseInt(years);
            float amount1;
            float result1;
            if(years1 == 1){
                result1 = (loan1 * (interest1 / 100 )) * years1;
            }
            else if(years1 >= 1){
                result1 = loan1;
                int count = 0;
                do{
                    result1 = (result1 * (interest1 / 100));
                    count++;
                }while(count < years1);
            }
            else{

            }
        }

    }

}