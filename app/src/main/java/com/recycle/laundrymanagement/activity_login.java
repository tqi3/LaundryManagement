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

public class activity_login extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    private EditText UsernameLogin;
    private EditText PasswordLogin;
    private TextView RegisterLink;
    private Button SubmitButton;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RegisterLink = (TextView) findViewById(R.id.registerlink);
        UsernameLogin = (EditText) findViewById(R.id.username);
        PasswordLogin = (EditText) findViewById(R.id.password);
        SubmitButton = (Button) findViewById(R.id.submit);

        //Submit Button Listener
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("EditText",UsernameLogin.getText().toString());
                Log.v("EditText",PasswordLogin.getText().toString());
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
