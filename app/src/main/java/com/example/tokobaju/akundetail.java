package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Objects;

public class akundetail extends AppCompatActivity {

    ImageView tombolback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_akundetail);

        final EditText namedashboard = findViewById(R.id.usernameprofil);
        namedashboard.setText(getIntent().getStringExtra("Username"));

        tombolback = findViewById(R.id.backprofil);
        tombolback.setOnClickListener(view -> {
            Intent intent = new Intent(akundetail.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        });

    }
}