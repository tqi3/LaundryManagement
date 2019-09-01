package com.recycle.laundrymanagement;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.*;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class activity_login extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    protected FirebaseDatabase database =  FirebaseDatabase.getInstance();

    private EditText EmailLogin;
    private EditText PasswordLogin;
    private TextView RegisterLink;
    private Button SubmitButton;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RegisterLink = (TextView) findViewById(R.id.registerlink);
        EmailLogin = (EditText) findViewById(R.id.emaillogin);
        PasswordLogin = (EditText) findViewById(R.id.passwordlogin);
        SubmitButton = (Button) findViewById(R.id.submit);

        DatabaseReference myRef = database.getReference("message");

        //Submit Button Listener
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.v("EditText",EmailLogin.getText().toString());
                Log.v("EditText",PasswordLogin.getText().toString());
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Email and Password");
                myRef.setValue(EmailLogin.getText().toString() + " and " + PasswordLogin.getText().toString());
            }
        });

        //RegisterLink Listener
        RegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_login.this, activity_register.class));
            }
        });



    }

    @Override
    public void onBackPressed(){
        //Disable going back to the MainActivity
        moveTaskToBack(true);
    }



}
