package com.example.loginappproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UserLoginActivity extends AppCompatActivity {

    private TextView welcomeTextView;
    private Button changePasswordButton, signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        // Initialize UI components
        welcomeTextView = findViewById(R.id.welcomeTextView);
        changePasswordButton = findViewById(R.id.changePasswordButton);
        signOutButton = findViewById(R.id.signOutButton);

        // Retrieve username from previous activity (you'll need to implement this logic)
        String username = "Username"; // Replace with actual username

        // Set welcome message
        welcomeTextView.setText("Welcome, " + username + "!");

        // Set click listeners for buttons
        changePasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle change password button click
            }
        });

        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sign out button click
                // You can perform any necessary sign-out logic here

                // Start the LoginActivity and clear the back stack
                Intent intent = new Intent(UserLoginActivity.this, UserLoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });


    }
}
