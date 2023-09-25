package com.example.pg12;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText ed1,ed2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onsend(View v)
    {
        String phoneNumber = ed1.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        /* Reading the text from the textbox */
        String msg = ed2.getText().toString();
        /* Sending the sms */
        sms.sendTextMessage(phoneNumber, null, msg, null, null);
    }
}