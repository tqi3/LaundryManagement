package com.recycle.laundrymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_register extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    private EditText EmailRegister;
    private EditText PasswordRegister;
    private EditText PhoneRegister;
    private Button SubmitRegister;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EmailRegister = (EditText) findViewById(R.id.emailregister);
        PasswordRegister = (EditText) findViewById(R.id.phoneregister);
        PhoneRegister = (EditText) findViewById(R.id.passwordregister);
        SubmitRegister = (Button) findViewById(R.id.register_submit);

        //Submit Button Listener
        SubmitRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("EditText",EmailRegister.getText().toString());
                Log.v("EditText",PasswordRegister.getText().toString());
                Log.v("EditText",PhoneRegister.getText().toString());
            }
        });
    }

    @Override
    public void onBackPressed(){
        //Disable going back to the MainActivity
        super.onBackPressed();
        Intent BackLogin = new Intent(activity_register.this,activity_login.class);
        startActivity(BackLogin);
        finish();

    }
}
