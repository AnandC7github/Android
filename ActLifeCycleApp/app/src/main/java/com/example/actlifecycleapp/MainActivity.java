package com.example.actlifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ActLifeCycleApp","OnCreate()");
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("ActLifeCycleApp","OnStart()");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d("ActLifeCycleApp","OnStop()");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("ActLifeCycleApp","OnDestroy()");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("ActLifeCycleApp","OnResume()");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("ActLifeCycleApp","OnPause()");
    }

}