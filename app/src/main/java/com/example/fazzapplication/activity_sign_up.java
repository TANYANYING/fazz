package com.example.fazzapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class activity_sign_up extends AppCompatActivity implements View.OnClickListener{

    private FirebaseAuth mAuth;

    //Variable
    private TextView VregisterUser;
    private EditText Vemail, Vusername,Vpassword,Vage,VShipAdd,Vphone;
    private ProgressBar VprogressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();

        VregisterUser = (Button) findViewById(R.id.button3);
        VregisterUser.setOnClickListener(this);

        Vemail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        Vusername = (EditText) findViewById(R.id.editTextTextPersonName);
        Vpassword = (EditText) findViewById(R.id.editTextTextPassword);
        Vage = (EditText) findViewById(R.id.editTextTextAge);
        VShipAdd = (EditText) findViewById(R.id.editTextShippingAdd);
        Vphone = (EditText) findViewById(R.id.editTextphone);


        VprogressBar = (ProgressBar) findViewById(R.id.progressBar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button3:
                registerUser();
                break;
        }
    }

    private void registerUser() {
        String email = Vemail.getText().toString().trim();
        String username = Vusername.getText().toString().trim();
        String password = Vpassword.getText().toString().trim();
        String age = Vage.getText().toString().trim();
        String shippingAddress = VShipAdd.getText().toString().trim();
        String phone = Vphone.getText().toString().trim();

        if(email.isEmpty()){
            Vemail.setError("PLease provide email");
            Vemail.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Vemail.setError("Please provide valid email!");
            Vemail.requestFocus();
            return;
        }

        if(username.isEmpty()){
            Vusername.setError("PLease provide username");
            Vusername.requestFocus();
            return;
        }

        if(password.isEmpty()){
            Vpassword.setError("PLease fill up the password");
            Vpassword.requestFocus();
            return;
        }

        if(password.length() < 6 ){
            Vpassword.setError("Password length must be 6 characters!");
            Vpassword.requestFocus();
            return;
        }

        if(age.isEmpty()){
            Vage.setError("PLease provide age");
            Vage.requestFocus();
            return;
        }

        if(shippingAddress.isEmpty()){
            VShipAdd.setError("PLease provide shipping address");
            VShipAdd.requestFocus();
            return;
        }

        if(phone.isEmpty()){
            Vphone.setError("PLease provide contact number");
            Vphone.requestFocus();
            return;
        }

        VprogressBar.setVisibility(View.VISIBLE);

        mAuth .createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            User user = new User(username, email, age, shippingAddress, phone);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if(task.isSuccessful()) {
                                        Toast.makeText(activity_sign_up.this, "Register successfully", Toast.LENGTH_LONG).show();
                                        VprogressBar.setVisibility(View.GONE);
                                        startActivity(new Intent(activity_sign_up.this, Login.class));
                                        //redirect to login layout!
                                    }
                                    else{
                                        Toast.makeText(activity_sign_up.this, "Register Failed,please try again!", Toast.LENGTH_LONG).show();
                                        VprogressBar.setVisibility(View.GONE);
                                    }
                                }
                            });
                        }

                        else{
                            Toast.makeText(activity_sign_up.this, "Register Failed", Toast.LENGTH_LONG).show();
                            VprogressBar.setVisibility(View.GONE);
                        }
                    }
                });

    }
}