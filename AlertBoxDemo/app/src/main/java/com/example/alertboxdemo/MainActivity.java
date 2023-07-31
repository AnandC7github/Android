package com.example.alertboxdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ontab(View v){
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
        obj.setMessage("Are You Sure??");
        obj.setCancelable(true);
        obj.setPositiveButton("Yes",this);
        obj.setNegativeButton("No",this);
        obj.show();
    }
}