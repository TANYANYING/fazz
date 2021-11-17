package com.example.fazzapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Economyitem extends AppCompatActivity {

    private Button em1,em2,em3,em4,em5,em6;

    private TextView itemName, itemprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economyitem);

        em1 = (Button) findViewById(R.id.ChickenriceAddToCartButton);
        em2 = (Button) findViewById(R.id.RedangdrumstickAddToCartButton);
        em3 = (Button) findViewById(R.id.GongBouRiceAddToCartButton);
        em4 = (Button) findViewById(R.id.FriedNoddleButton);
        em5 = (Button) findViewById(R.id.PastaAddToCartButton);
        em6 = (Button) findViewById(R.id.MeeGorengButton);

        em1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.chickenRiceName);
                itemprice = (TextView) findViewById(R.id.cheickenRicePrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(Economyitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(Economyitem.this,Economyitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        em2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.RedangdrumstickName);
                itemprice = (TextView) findViewById(R.id.RedangdrumstickPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(Economyitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(Economyitem.this,Economyitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                 startActivity(intent);
                 finish();
            }
        });

        em3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.GongBouRiceName);
                itemprice = (TextView) findViewById(R.id.GongBouRicePrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(Economyitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(Economyitem.this,Economyitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        em4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.FriedNoddleName);
                itemprice = (TextView) findViewById(R.id.FriedNoddlePrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(Economyitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(Economyitem.this,Economyitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        em5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.PastaName);
                itemprice = (TextView) findViewById(R.id.PastaPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(Economyitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(Economyitem.this,Economyitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        em6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.MeeGorengName);
                itemprice = (TextView) findViewById(R.id.MeeGorengPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(Economyitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(Economyitem.this,Economyitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });
    }

}