package com.recycle.laundrymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_register extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    private static final int REQUEST_SIGNUP = 0;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @Override
    public void onBackPressed(){
        //Disable going back to the MainActivity
        moveTaskToBack(true);
    }
}
