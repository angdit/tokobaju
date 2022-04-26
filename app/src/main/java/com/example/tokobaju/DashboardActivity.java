package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class DashboardActivity extends AppCompatActivity {

    TextView btnLogout;
    LinearLayout layoutlacoste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        final TextView namedashboard = findViewById(R.id.textUsername);
        namedashboard.setText(getIntent().getStringExtra("Email"));

        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        layoutlacoste = findViewById(R.id.layoutLacoste);
        layoutlacoste.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, AllCategories.class);
            startActivity(intent);
            finish();
        });
    }
}