package com.example.fazzapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getstarted = (Button) findViewById(R.id.button2);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityStarted();
            }
        });

    }
    public void openActivityStarted(){
        Intent intent = new Intent (this,Login.class);
        startActivity(intent);
    }
}