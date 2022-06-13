package com.example.tokobaju;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Objects;

public class ActivityKeranjang extends AppCompatActivity {

    TextView ViewNama, ViewHarga, textSubTotal, textOngkir, textTotal, checkout;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_keranjang);
        Bundle extras = getIntent().getExtras();

        ViewNama = findViewById(R.id.namaproduk0);
        ViewHarga = findViewById(R.id.hargaproduk0);
        ViewNama.setText(getIntent().getStringExtra("nama"));
        ViewHarga.setText(getIntent().getStringExtra("harga"));
        NumberFormat formatter = new DecimalFormat("#,###");

        String strHarga = ViewHarga.getText().toString();
        strHarga = strHarga.replace("Rp ", "");
        strHarga = strHarga.replace(".", "");
        double subtotal = Double.parseDouble(strHarga);

        String strSubtotal = formatter.format(subtotal);
        strSubtotal = "Rp " + strSubtotal;

        double ongkir = 20000;
        String strOngkir = formatter.format(ongkir);
        strOngkir = "Rp " + strOngkir;

        double total = subtotal + ongkir;
        String strTotal = formatter.format(total);
        strTotal = "Rp " + strTotal;

        textSubTotal = findViewById(R.id.subtotalharga);
        textSubTotal.setText(strSubtotal);
        textOngkir = findViewById(R.id.ongkirharga);
        textOngkir.setText(strOngkir);
        textTotal = findViewById(R.id.totalharga);
        textTotal.setText(strTotal);

        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(view -> {
            Intent intents = new Intent(ActivityKeranjang.this, DashboardActivity.class);
            startActivity(intents);
            finish();
        });
        checkout = findViewById(R.id.checkout);
        checkout.setOnClickListener(view -> {
            Intent intents = new Intent(ActivityKeranjang.this, checkoutsukses.class);
            startActivity(intents);
            finish();
        });

    }
        public void displayToast(String message){
            Toast.makeText(getApplicationContext(), message,
                    Toast.LENGTH_SHORT).show();
        }
        public void checkoutkeranjang(View view)  { displayToast("Anda telah Checkout Produk di Keranjang, silahkan lanjutkan Transaksi!");
    }

}