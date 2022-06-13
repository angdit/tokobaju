package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;


public class LoginActivity extends AppCompatActivity {

    TextView register;
    TextView loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_login);

        register = findViewById(R.id.register);
        loginbtn = findViewById(R.id.loginbtn);
        final EditText SIusername = findViewById(R.id.username);
        final EditText SUusername = findViewById(R.id.username);
        final EditText SUpassword = findViewById(R.id.password);

        SUusername.setText(getIntent().getStringExtra("Username"));
        SUpassword.setText(getIntent().getStringExtra("Password"));

        register.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });

        loginbtn.setOnClickListener(view ->  {
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            intent.putExtra("Username",SIusername.getText().toString());
            startActivity(intent);
            finish();
        });


    }

    public void igvisit(View view) {
        String url = "https://www.instagram.com/dpad666/";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }

    public void googlevisit(View view) {
        String url = "https://anggadiningrat666.blogspot.com/";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }

    public void fbvisit(View view) {
        String url = "https://www.facebook.com/profile.php?id=100008681974201";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }
}