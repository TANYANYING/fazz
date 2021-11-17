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
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class activity_forgetpassword extends AppCompatActivity {

    private EditText emailTxtReset;
    private Button resetPassButton;
    private ProgressBar progressBar;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        emailTxtReset = (EditText) findViewById(R.id.resetPassText);
        resetPassButton = (Button) findViewById(R.id.resetpassBtn);
        progressBar = (ProgressBar) findViewById(R.id.progressBar3);

        auth = FirebaseAuth.getInstance();

        resetPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetPassword();
            }
        });
    }
    private void resetPassword() {
        String email = emailTxtReset.getText().toString().trim();

        if (email.isEmpty()){
            emailTxtReset.setError("Please enter email!");
            emailTxtReset.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailTxtReset.setError("Please enter valid email!");
            emailTxtReset.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if(task.isSuccessful()){
                    Toast.makeText(activity_forgetpassword.this, "Check email to reset your password",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.INVISIBLE);
                    startActivity(new Intent(activity_forgetpassword.this, Login.class));
                }
                else{
                    Toast.makeText(activity_forgetpassword.this, "Something went wrong, please retry",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.INVISIBLE);
                }

            }
        });
    }

}