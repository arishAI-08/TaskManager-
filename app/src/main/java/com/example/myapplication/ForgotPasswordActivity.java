package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ForgotPasswordActivity extends AppCompatActivity {

    private TextInputEditText etEmail;
    private Button btnSendLink;
    private TextView tvBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        etEmail = findViewById(R.id.etEmail);
        btnSendLink = findViewById(R.id.btnSendLink);
        tvBackToLogin = findViewById(R.id.tvBackToLogin);

        btnSendLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText() != null ? etEmail.getText().toString().trim() : "";
                if (email.isEmpty()) {
                    Toast.makeText(ForgotPasswordActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ForgotPasswordActivity.this, "Reset link sent to " + email, Toast.LENGTH_SHORT).show();
                    // Navigate to ResetPasswordActivity
                    Intent intent = new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        tvBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
