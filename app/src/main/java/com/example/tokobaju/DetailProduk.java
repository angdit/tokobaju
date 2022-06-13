package com.example.tokobaju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class DetailProduk extends AppCompatActivity {

    int res_image;
    ImageView btnBack, ViewImage;
    TextView btnChart, ViewNama, ViewHarga, ViewDeskripsi;
    ArrayList<Checkout> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_detail_produk);
        Bundle extras = getIntent().getExtras();
        Intent intent = getIntent();
        list = (ArrayList<Checkout>) intent.getSerializableExtra("checkout");
        ViewImage = findViewById(R.id.productImage);
        ViewNama = findViewById(R.id.productNama);
        ViewHarga = findViewById(R.id.productHarga);
        ViewDeskripsi = findViewById(R.id.deskripsiproduk);
        res_image = extras.getInt("image");
        ViewImage.setImageResource(res_image);
        ViewNama.setText(list.get(0).getNama());
        ViewHarga.setText(list.get(0).getHarga());
        ViewDeskripsi.setText(list.get(0).getDeskripsi());
        btnBack = findViewById(R.id.backcategories);
        btnBack.setOnClickListener(view -> {
            Intent intents = new Intent(DetailProduk.this, AllCategories.class);
            startActivity(intents);
            finish();
        });

        btnChart = findViewById(R.id.buttonchart);
        btnChart.setOnClickListener(view ->{
            String nama = ViewNama.getText().toString();
            String harga = ViewHarga.getText().toString();
            Intent intents = new Intent(DetailProduk.this, ActivityKeranjang.class);
            intents.putExtra("nama",nama);
            intents.putExtra("harga",harga);
            startActivity(intents);
            finish();
        });


    }

}