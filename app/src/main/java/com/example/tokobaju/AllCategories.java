package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class AllCategories extends AppCompatActivity {

    ImageView tombolback;
    RelativeLayout detailproduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_categories);
        detailproduk = findViewById(R.id.produk1);
        detailproduk.setOnClickListener(view -> {
            Intent intent = new Intent(AllCategories.this, DetailProduk.class);
            startActivity(intent);
            finish();
        });
        tombolback = findViewById(R.id.backcategories);
        tombolback.setOnClickListener(view ->{
            Intent intent = new Intent(AllCategories.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        });
    }
}