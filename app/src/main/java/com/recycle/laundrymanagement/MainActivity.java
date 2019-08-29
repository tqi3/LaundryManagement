package com.recycle.laundrymanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent intent = new Intent(this, activity_login.class);
        //startActivity(intent);


        // setup viewpager and table layout
        viewpage = findViewById(R.id.viewpager);
        OnBoardingPageAdapter onBoardingPageAdapter = new OnBoardingPageAdapter(getSupportFragmentManager());
        viewpage.setAdapter(onBoardingPageAdapter);
    }


}
