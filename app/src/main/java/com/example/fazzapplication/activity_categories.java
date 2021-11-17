package com.example.fazzapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fazzapplication.R;

public class activity_categories extends AppCompatActivity {

    private CardView EcoMealCard,BeverageCard, HouseHoldCard, InstantCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        EcoMealCard = (CardView) findViewById(R.id.EconomyCard);
        BeverageCard = (CardView) findViewById(R.id.BeverageCard);
        HouseHoldCard = (CardView) findViewById(R.id.HouseholdCard);
        InstantCard = (CardView) findViewById(R.id.InstantFoodCard);

        EcoMealCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_categories.this, Economyitem.class));
            }
        });
        BeverageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_categories.this, beverageitem.class));
            }
        });
        HouseHoldCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_categories.this, HouseholdItem.class));
            }
        });
        InstantCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_categories.this, InstantItem.class));
            }
        });

    }
}