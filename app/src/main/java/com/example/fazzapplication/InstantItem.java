package com.example.fazzapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InstantItem extends AppCompatActivity {

    private Button if1,if2,if3,if4,if5,if6;

    private TextView itemName, itemprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_item);

        if1= (Button) findViewById(R.id.MushroomSoupButton);
        if2 = (Button) findViewById(R.id.BigAyamButton);
        if3 = (Button) findViewById(R.id.HotcupAsamLaksaButton);
        if4 = (Button) findViewById(R.id.MiSedapMigorengButton);
        if5 = (Button) findViewById(R.id.CheesyCarbonaraButton);
        if6 = (Button) findViewById(R.id.YopokkiButton);

        if1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.MushroomSoupName);
                itemprice = (TextView) findViewById(R.id.MushroomSoupPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(InstantItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(InstantItem.this,InstantItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        if2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.BigAyamName);
                itemprice = (TextView) findViewById(R.id.BigAyamPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(InstantItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(InstantItem.this,InstantItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        if3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.HotcupAsamLaksaName);
                itemprice = (TextView) findViewById(R.id.HotcupAsamLaksaPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(InstantItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(InstantItem.this,InstantItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        if4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.MiSedapMigorengPriceName);
                itemprice = (TextView) findViewById(R.id.MiSedapMigorengPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(InstantItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(InstantItem.this,InstantItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        if5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.CheesyCarbonaraName);
                itemprice = (TextView) findViewById(R.id.CheesyCarbonaraPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(InstantItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(InstantItem.this,InstantItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        if6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.YopokkiName);
                itemprice = (TextView) findViewById(R.id.YopokkiName);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(InstantItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(InstantItem.this,InstantItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });
    }
}