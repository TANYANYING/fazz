package com.example.fazzapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class beverageitem extends AppCompatActivity {

    private Button bv1,bv2,bv3,bv4,bv5,bv6;

    private TextView itemName, itemprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverageitem);

        bv1 = (Button) findViewById(R.id.RebinaButton);
        bv2 = (Button) findViewById(R.id.ColaButton);
        bv3 = (Button) findViewById(R.id.MilkTeaButton);
        bv4 = (Button) findViewById(R.id.FrappuccinoButton);
        bv5 = (Button) findViewById(R.id.MiloButton);
        bv6 = (Button) findViewById(R.id.OrangeJuiceButton);

        bv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.RebinaName);
                itemprice = (TextView) findViewById(R.id.RebinaPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(beverageitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(beverageitem.this,beverageitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        bv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.ColaName);
                itemprice = (TextView) findViewById(R.id.ColaPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(beverageitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(beverageitem.this,beverageitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        bv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.MilkTeaName);
                itemprice = (TextView) findViewById(R.id.MilkTeaPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(beverageitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(beverageitem.this,beverageitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        bv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.FrappuccinoName);
                itemprice = (TextView) findViewById(R.id.FrappuccinoPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(beverageitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(beverageitem.this,beverageitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        bv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.MiloName);
                itemprice = (TextView) findViewById(R.id.MiloPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(beverageitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(beverageitem.this,beverageitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        bv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.OrangeJuiceName);
                itemprice = (TextView) findViewById(R.id.OrangeJuicePrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(beverageitem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(beverageitem.this,beverageitem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });
    }
}