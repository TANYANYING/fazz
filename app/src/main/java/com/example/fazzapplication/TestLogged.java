package com.example.fazzapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class TestLogged extends AppCompatActivity {

    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;

    private EditText UsernameNow, Editage, EditAddress, Editphone, Editemail, EditButton;

    private EditText updateTextAge, updateTextAddress, updateTextPhone;

    private Button editInfo, EditSaveBtn, logout;

    private CardView ShopCard,OrderCard, PaymentCard;

    //Disable back button
    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_logged);

        //define button value
        ShopCard = (CardView) findViewById(R.id.ShopCardview);
        OrderCard = (CardView) findViewById(R.id.OrderCardview);

        //define button value
        logout = (Button) findViewById(R.id.button5);
        editInfo = (Button) findViewById(R.id.EditButton);
        EditSaveBtn = (Button) findViewById(R.id.saveButton);

        //define textview value
        UsernameNow = findViewById(R.id.UsernameTxtdata);
        Editage = findViewById(R.id.AgeTxtdata);
        EditAddress = findViewById(R.id.ShippingAddTxtData);
        Editphone = findViewById(R.id.phoneTxtData);
        Editemail = findViewById(R.id.emailTxtData);

        //Shopping cardview click action
        ShopCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestLogged.this, activity_categories.class));
            }
        });

        //Order cardview click action
        OrderCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestLogged.this, activity_cart_order.class));
            }
        });


        //save Button action
        EditSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView SetusernameTextView = (TextView) findViewById(R.id.UsernameTxtdata);
                final TextView SetageTextView = (TextView) findViewById(R.id.AgeTxtdata);
                final TextView SetshippingAddressTextView = (TextView) findViewById(R.id.ShippingAddTxtData);
                final TextView SetphoneTextView = (TextView) findViewById(R.id.phoneTxtData);
                final TextView SetemailTextView = (TextView) findViewById(R.id.emailTxtData);

                //Get current textview data
                String updateUsername = SetusernameTextView.getText().toString().trim();
                String updateAge = SetageTextView.getText().toString().trim();
                String updateAddress = SetshippingAddressTextView.getText().toString().trim();
                String updatephone = SetphoneTextView.getText().toString().trim();
                updateData(updateUsername,updateAge,updateAddress,updatephone);

                //disable textView
                SetageTextView.setFocusable(false);
                SetshippingAddressTextView.setFocusable(false);
                SetphoneTextView.setFocusable(false);
                SetemailTextView.setFocusable(false);

                //disable or enable button after onclick
                editInfo.setEnabled(true);
                EditSaveBtn.setEnabled(false);


            }
        });

        //Edit Info
        editInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TestLogged.this,"Please edit info and press save",Toast.LENGTH_LONG).show();
                Editage.setFocusableInTouchMode(true);
                EditAddress.setFocusableInTouchMode(true);
                Editphone.setFocusableInTouchMode(true);
                editInfo.setEnabled(false);
                EditSaveBtn.setEnabled(false);

                //check text is empty or not to disable button
                Editage.addTextChangedListener(profileTextwatcher);
                EditAddress.addTextChangedListener(profileTextwatcher);
                Editphone.addTextChangedListener(profileTextwatcher);
            }
        });

        //logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditSaveBtn.setEnabled(false);
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(TestLogged.this, Login.class));
            }
        });

        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        final TextView SetgreetingTextView = (TextView) findViewById(R.id.Greeting);
        final TextView SetusernameTextView = (TextView) findViewById(R.id.UsernameTxtdata);
        final TextView SetageTextView = (TextView) findViewById(R.id.AgeTxtdata);
        final TextView SetshippingAddressTextView = (TextView) findViewById(R.id.ShippingAddTxtData);
        final TextView SetphoneTextView = (TextView) findViewById(R.id.phoneTxtData);
        final TextView SetemailTextView = (TextView) findViewById(R.id.emailTxtData);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if(userProfile != null) {
                    String Showfullname = userProfile.username;
                    String Showemail = userProfile.email;
                    String Showage = userProfile.age;
                    String Showaddress = userProfile.address;
                    String Showphone = userProfile.phone;

                    //Set text and disable edit
                    SetgreetingTextView.setText("Hello! "+ Showfullname);
                    SetgreetingTextView.setFocusable(false);

                    SetusernameTextView.setText(Showfullname);
                    SetusernameTextView.setFocusable(false);

                    SetageTextView.setText(Showage);
                    SetageTextView.setFocusable(false);

                    SetshippingAddressTextView.setText(Showaddress);
                    SetshippingAddressTextView.setFocusable(false);

                    SetphoneTextView.setText(Showphone);
                    SetphoneTextView.setFocusable(false);

                    SetemailTextView.setText(Showemail);
                    SetemailTextView.setFocusable(false);
                }
            }

            //if cannot found acc show this message
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TestLogged.this,"Something went wrong, please try again!",Toast.LENGTH_LONG).show();
            }
        });
    }

    //check text is empty or not to disable button
    private TextWatcher profileTextwatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String ageInput = Editage.getText().toString().trim();
            String addressInput = EditAddress.getText().toString().trim();
            String phoneInput = Editphone.getText().toString().trim();
            EditSaveBtn.setEnabled(!ageInput.isEmpty() && !addressInput.isEmpty() && !phoneInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void updateData(String updateUsername,String updateAge, String updateAddress, String updatephone) {
        HashMap User = new HashMap();
        User.put("Username",updateUsername);
        User.put("age",updateAge);
        User.put("address",updateAddress);
        User.put("Phone",updatephone);

        reference = FirebaseDatabase.getInstance().getReference("Users");
        reference.child(userID).updateChildren(User).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(@NonNull Task task) {
                if(task.isSuccessful()){
                    Toast.makeText(TestLogged.this,"You Info have been updated",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(TestLogged.this,"Something went wrong, please try again :(",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}