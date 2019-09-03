package com.recycle.laundrymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class OnBoardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        final Context context = getApplicationContext();
        Toast.makeText(context, Config.useremail + Config.adminFlag, Toast.LENGTH_SHORT).show();
    }


}
