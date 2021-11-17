package com.example.fazzapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_cart_order extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ArrayList<cart_item> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button buttonInsert;
    private Button buttonRemove;
    private Button buttonPurchase;
    private EditText editTextInsert;
    private EditText editTextRemove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_order);

        Button buttonPurchase = findViewById(R.id.CheckoutTxt);
        buttonPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_cart_order.this, activity_Purchased.class));
            }
        });

        Spinner spinner = findViewById(R.id.planets_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        createExampleList();
        buildRecyclerView();
//        setButtons();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

//    public void insertItem(int position) {
//        mExampleList.add(position, new cart_item(R.drawable.ic_android, "New Item At Position" + position, "This is Line 2"));
//        mAdapter.notifyItemInserted(position);
//    }

    public void removeItem(int position) {
        mExampleList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }

    public void changeItem(int position, String text) {
        mExampleList.get(position).changeText1(text);
        mAdapter.notifyItemChanged(position);
    }

        public void createExampleList() {
            mExampleList = new ArrayList<>();
            mExampleList.add(new cart_item(R.drawable.em2, "RedangDrumstick", "7.60"));
            mExampleList.add(new cart_item(R.drawable.bv3, "MilkTea", "3.50"));
            mExampleList.add(new cart_item(R.drawable.hs3, "Cocorex Bleach", "14.0"));
            mExampleList.add(new cart_item(R.drawable.if4, "Hot cup Asam Laksa", "2.50"));
            mExampleList.add(new cart_item(R.drawable.bv1, "Rebina", "2.50"));
            mExampleList.add(new cart_item(R.drawable.em1, "ChickenRice", "5.60"));
        }

        public void buildRecyclerView() {
            mRecyclerView = findViewById(R.id.recyclerView);
            mRecyclerView.setHasFixedSize(true);
            mLayoutManager = new LinearLayoutManager(this);
            mAdapter = new ExampleAdapter(mExampleList);

            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setAdapter(mAdapter);

            mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
//                    changeItem(position, "Clicked");
                    changeItem(position, "Clicked");
                }

                @Override
                public void onDeleteClick(int position) {
                    removeItem(position);
                }
            });
        }


//    public void setButtons() {
//        buttonInsert = findViewById(R.id.button_insert);
//        buttonRemove = findViewById(R.id.button_remove);
//        editTextInsert = findViewById(R.id.edittext_insert);
//        editTextRemove = findViewById(R.id.edittext_remove);
//
//        buttonInsert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int position = Integer.parseInt(editTextInsert.getText().toString());
//                insertItem(position);
//            }
//        });
//
//        buttonRemove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int position = Integer.parseInt(editTextRemove.getText().toString());
//                removeItem(position);
//            }
//        });
//    }
}
