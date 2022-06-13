package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;


public class DashboardActivity extends AppCompatActivity {

    ImageView btnLogout;
    LinearLayout layoutlacoste;
    LinearLayout layoutnike;
    LinearLayout layoutvans;
    LinearLayout layoutthraher;
    ImageView btnKeranjang;
    ImageView icProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_dashboard);

        final TextView namedashboard = findViewById(R.id.textUsername);
        namedashboard.setText(getIntent().getStringExtra("Username"));


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

        layoutnike = findViewById(R.id.layoutNike);
        layoutnike.setOnClickListener(view ->{
            Intent intent = new Intent(DashboardActivity.this, all_categories2.class);
            startActivity(intent);
            finish();
        });

        layoutvans = findViewById(R.id.layoutVans);
        layoutvans.setOnClickListener(view ->{
            Intent intent = new Intent(DashboardActivity.this,all_categories3.class);
            startActivity(intent);
            finish();
        });

        layoutthraher = findViewById(R.id.layoutThrasher);
        layoutthraher.setOnClickListener(view ->{
            Intent intent = new Intent(DashboardActivity.this,all_categories4.class);
            startActivity(intent);
            finish();
        });

        btnKeranjang = findViewById(R.id.keranjang);
        btnKeranjang.setOnClickListener(view ->{
            Intent intent = new Intent(DashboardActivity.this,ActivityKeranjang.class);
            startActivity(intent);
            finish();
        });

        icProfil = findViewById(R.id.iconprofil);
        icProfil.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this,akundetail.class);
            intent.putExtra("Username",namedashboard.getText().toString());
            startActivity(intent);
            finish();
        });
    }
}