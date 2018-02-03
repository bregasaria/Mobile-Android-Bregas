package com.example.user.bregasariawicaksana_1202150052_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText namamakanan,jml;
    private Button restoran,restoran2;
    private TextView tempatmakan;

    private int uang = 65500;

    private int jumlah1,hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namamakanan = (EditText) findViewById(R.id.menu);
        jml = (EditText) findViewById(R.id.jumlah);
        tempatmakan = (TextView) findViewById(R.id.restoran);
//
//        restaurant = (Button) findViewById(R.id.eatbus);
//        restaurant2 = (Button) findViewById(R.id.abnormal);
//


    }

    public void launcheatbus(View view) {


        String menu = namamakanan.getText().toString();
        String jumlah = jml.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hasil = jumlah1 * 50000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);

        bundle.putString("Jumlah",jumlah);

        bundle.putString("Total",String.valueOf(hasil));

        bundle.putString("Restoran","Eatbus");

        Intent a = new Intent(this,Activity_kedua.class);

        a.putExtras(bundle);

        startActivity(a);

        if (hasil > uang){
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_SHORT).show();

        }




    }

    public void lauchabnormal(View view) {

        String menu = namamakanan.getText().toString();
        String jumlah = jml.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hasil = jumlah1 * 30000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);

        bundle.putString("Jumlah",jumlah);

        bundle.putString("Total",String.valueOf(hasil));

        bundle.putString("Restoran","Abnormal");

        Intent a = new Intent(this,Activity_kedua.class);

        a.putExtras(bundle);

        startActivity(a);

        if (hasil < uang){
            Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_SHORT).show();

        }
        else
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_SHORT).show();
    }

}