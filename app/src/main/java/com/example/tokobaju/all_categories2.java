package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.Objects;

public class all_categories2 extends AppCompatActivity {

    ImageView tombolback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_all_categories2);
        tombolback = findViewById(R.id.backcategories);
        tombolback.setOnClickListener(view ->{
            Intent intent = new Intent(all_categories2.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        });
    }
}