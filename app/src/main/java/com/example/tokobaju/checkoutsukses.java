package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class checkoutsukses extends AppCompatActivity {

    TextView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkoutsukses);

        btnBack = findViewById(R.id.btnDashboard);
        btnBack.setOnClickListener(view ->{
            Intent intent = new Intent(checkoutsukses.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        });
    }
}