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

<<<<<<< HEAD
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

=======
>>>>>>> 8ff9f7ef97ae6d5fa39ecd7c12626ae80e2f2d23
public class activity_login extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
<<<<<<< HEAD
    protected FirebaseDatabase database =  FirebaseDatabase.getInstance();

    private EditText EmailLogin;
=======
    private EditText UsernameLogin;
>>>>>>> 8ff9f7ef97ae6d5fa39ecd7c12626ae80e2f2d23
    private EditText PasswordLogin;
    private TextView RegisterLink;
    private Button SubmitButton;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RegisterLink = (TextView) findViewById(R.id.registerlink);
<<<<<<< HEAD
        EmailLogin = (EditText) findViewById(R.id.emaillogin);
        PasswordLogin = (EditText) findViewById(R.id.passwordlogin);
        SubmitButton = (Button) findViewById(R.id.submit);

        DatabaseReference myRef = database.getReference("message");

=======
        UsernameLogin = (EditText) findViewById(R.id.username);
        PasswordLogin = (EditText) findViewById(R.id.password);
        SubmitButton = (Button) findViewById(R.id.submit);

>>>>>>> 8ff9f7ef97ae6d5fa39ecd7c12626ae80e2f2d23
        //Submit Button Listener
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD

                Log.v("EditText",EmailLogin.getText().toString());
                Log.v("EditText",PasswordLogin.getText().toString());
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Email and Password");
                myRef.setValue(EmailLogin.getText().toString() + " and " + PasswordLogin.getText().toString());
=======
                Log.v("EditText",UsernameLogin.getText().toString());
                Log.v("EditText",PasswordLogin.getText().toString());
>>>>>>> 8ff9f7ef97ae6d5fa39ecd7c12626ae80e2f2d23
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
