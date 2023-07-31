package com.example.alertboxdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ontab(View v){
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
        obj.setMessage("Are You Sure??");
        obj.setCancelable(true);
        obj.setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) this);
        obj.setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) this);
        //obj.show();
        AlertDialog d = obj.create();
        d.show();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if(i == -1){
            finish(); //if yes, finish there
        }
        else{
            dialogInterface.cancel(); //To go to previous page
        }
    }
    public void onfun(View v){
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
        obj.setMessage("Are You Sure??").setCancelable(true).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }}).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog d = obj.create();
        d.show();
    }
}