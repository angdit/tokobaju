package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;


public class AllCategories extends AppCompatActivity {

    ImageView tombolback;
    RelativeLayout detailproduk;
    RelativeLayout produk1,produk2,produk3,produk4;
    ArrayList<Checkout> produklist;
    Checkout dataproduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        produklist = new ArrayList<>();
        setContentView(R.layout.activity_all_categories);
        detailproduk = findViewById(R.id.produk1);
        detailproduk.setOnClickListener(view -> {
            Intent intent = new Intent(AllCategories.this, DetailProduk.class);
            startActivity(intent);
            finish();
        });
        tombolback = findViewById(R.id.backcategories);
        tombolback.setOnClickListener(view -> {
            Intent intent = new Intent(AllCategories.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        });


        produk1 = findViewById(R.id.produk1);
        produk1.setOnClickListener(view ->{
            String iDImage = "lacoste1";
            int intDrawImg = getResources().getIdentifier(iDImage, "drawable", getPackageName());
            dataproduk = new Checkout("Lacoste27 T-Shirt", "Rp 1.099.000","Baju Lacoste27 T-Shirt kualitas mantap!");
            produklist.add(dataproduk);
            Intent intent = new Intent(AllCategories.this, DetailProduk.class);
            intent.putExtra("checkout",produklist);
            intent.putExtra("image", intDrawImg);
            startActivity(intent);
            finish();
        });

        produk2 = findViewById(R.id.produk2);
        produk2.setOnClickListener(view ->{
            String iDImage = "lacoste2";
            int intDrawImg = getResources().getIdentifier(iDImage, "drawable", getPackageName());
            dataproduk = new Checkout("Lacoste Crewneck", "Rp 1.200.000","Crewneck Lacoste terbaik!");
            produklist.add(dataproduk);
            Intent intent = new Intent(AllCategories.this, DetailProduk.class);
            intent.putExtra("checkout",produklist);
            intent.putExtra("image", intDrawImg);
            startActivity(intent);
            finish();
        });

        produk3 = findViewById(R.id.produk3);
        produk3.setOnClickListener(view ->{
            String iDImage = "lacoste3";
            int intDrawImg = getResources().getIdentifier(iDImage, "drawable", getPackageName());
            dataproduk = new Checkout("Lacoste Poloshirt", "Rp 900.000","Poloshirt Lacoste warna biru anjay!");
            produklist.add(dataproduk);
            Intent intent = new Intent(AllCategories.this, DetailProduk.class);
            intent.putExtra("checkout",produklist);
            intent.putExtra("image", intDrawImg);
            startActivity(intent);
            finish();
        });

        produk4 = findViewById(R.id.produk4);
        produk4.setOnClickListener(view ->{
            String iDImage = "lacoste4";
            int intDrawImg = getResources().getIdentifier(iDImage, "drawable", getPackageName());
            dataproduk = new Checkout("Lacoste x MC Hood", "Rp 2.000.000","Hoodie Lacoste kolaborasi dengan Minecraft!");
            produklist.add(dataproduk);
            Intent intent = new Intent(AllCategories.this, DetailProduk.class);
            intent.putExtra("checkout",produklist);
            intent.putExtra("image", intDrawImg);
            startActivity(intent);
            finish();
        });
    }
}