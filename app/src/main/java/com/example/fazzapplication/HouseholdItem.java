package com.example.fazzapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HouseholdItem extends AppCompatActivity {

    private Button h1,h2,h3,h4,h5,h6;

    private TextView itemName, itemprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household_item);

        h1 = (Button) findViewById(R.id.ZipCleaningPowederButton);
        h2 = (Button) findViewById(R.id.AjaxFabelosoButton);
        h3 = (Button) findViewById(R.id.CocorexBleachButton);
        h4 = (Button) findViewById(R.id.LabourButton);
        h5 = (Button) findViewById(R.id.GloButton);
        h6 = (Button) findViewById(R.id.DaiaSoftenerButton);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.ZipCleaningPowederName);
                itemprice = (TextView) findViewById(R.id.ZipCleaningPowederPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(HouseholdItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(HouseholdItem.this,HouseholdItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.AjaxFabelosoName);
                itemprice = (TextView) findViewById(R.id.AjaxFabelosoPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(HouseholdItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(HouseholdItem.this,HouseholdItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.CocorexBleachName);
                itemprice = (TextView) findViewById(R.id.CocorexBleachPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(HouseholdItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(HouseholdItem.this,HouseholdItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.LabourName);
                itemprice = (TextView) findViewById(R.id.LabourPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(HouseholdItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(HouseholdItem.this,HouseholdItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.GloName);
                itemprice = (TextView) findViewById(R.id.GloPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(HouseholdItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(HouseholdItem.this,HouseholdItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });

        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Strname,Strprice;
                itemName = (TextView) findViewById(R.id.DaiaSoftenerName);
                itemprice = (TextView) findViewById(R.id.DaiaSoftenerPrice);
                Strname = itemName.getText().toString();
                Strprice = itemprice.getText().toString();

                Toast.makeText(HouseholdItem.this,"Item added",Toast.LENGTH_LONG).show();
                String sendNameData = Strprice;
                String sendPricedata = Strname;
                Intent intent = new Intent(HouseholdItem.this,HouseholdItem.class);
                intent.putExtra("pass_name",sendNameData);
                intent.putExtra("pass_price",sendPricedata);
                startActivity(intent);
                finish();
            }
        });
    }
}