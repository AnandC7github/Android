package com.example.loginappproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterationActivity extends AppCompatActivity {

    private EditText registerUsernameEditText, registerPasswordEditText, confirmPasswordEditText;
    private Button doRegisterButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        // Initialize UI components
        registerUsernameEditText = findViewById(R.id.registerUsernameEditText);
        registerPasswordEditText = findViewById(R.id.registerPasswordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        doRegisterButton = findViewById(R.id.doRegisterButton);
        backButton = findViewById(R.id.backButton);

        // Set click listeners for buttons
        doRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = registerUsernameEditText.getText().toString();
                String password = registerPasswordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                if (password.equals(confirmPassword)) {
                    boolean isUsernameTaken = checkIfUsernameTaken(username);

                    if (isUsernameTaken) {
                        Toast.makeText(RegisterationActivity.this, "Username already taken", Toast.LENGTH_SHORT).show();
                    } else {
                        // Perform registration logic here
                        // You can save the user data to a database or perform other actions
                        Toast.makeText(RegisterationActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                        finish(); // Close the registration activity and return to the previous activity
                    }
                } else {
                    Toast.makeText(RegisterationActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterationActivity.this, UserLoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }

    private boolean checkIfUsernameTaken(String username) {
        // Implement your database check logic here
        // Return true if the username is already taken, false otherwise
        return false; // Placeholder value
    }
}


