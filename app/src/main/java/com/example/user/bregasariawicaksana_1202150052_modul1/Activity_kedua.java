package com.example.user.bregasariawicaksana_1202150052_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_kedua extends AppCompatActivity {

    TextView a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        a = (TextView) findViewById(R.id.namamakanan);

        b = (TextView) findViewById(R.id.porsi);

        c = (TextView) findViewById(R.id.harga);

        d = (TextView) findViewById(R.id.restoran);

        if (getIntent().getExtras() != null) {

            Bundle bundle = getIntent().getExtras();
            a.setText(bundle.getString("Menu"));
            b.setText(bundle.getString("Jumlah"));
            c.setText(bundle.getString("Total"));
            d.setText(bundle.getString("Restoran"));
        } else {
            a.setText(getIntent().getStringExtra("Menu"));
            b.setText(getIntent().getStringExtra("Jumlah"));
            c.setText(getIntent().getStringExtra("Total"));
            d.setText(getIntent().getStringExtra("Restoran"));
        }
    }
}