package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextView txtRegister;
    TextView btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtRegister = findViewById(R.id.txtRegister);
        btnLogin = findViewById(R.id.btnLogin);
        final TextInputEditText SIusername = findViewById(R.id.edtSignInEmail);
        final TextInputEditText SIpassword = findViewById(R.id.edtSignInPassword);
        final TextInputEditText SUusername = findViewById(R.id.edtSignInEmail);
        SUusername.setText(getIntent().getStringExtra("Username"));
        txtRegister.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });

        btnLogin.setOnClickListener(view ->  {
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            intent.putExtra("Email",SIusername.getText().toString());
            intent.putExtra("Password",SIpassword.getText().toString());
            startActivity(intent);
            finish();
        });
    }
}