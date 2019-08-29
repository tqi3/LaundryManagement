package com.recycle.laundrymanagement;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class activity_login extends Fragment {

    protected EditText usernameEditText ;
    protected EditText passwordEditText ;
    protected Button submitButton;
    //protected DatabaseReference database;

    public static activity_login newInstance(){
        Bundle args = new Bundle();

        activity_login fragment = new activity_login();
        fragment.setArguments(args);
        return fragment;
    }

    public activity_login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = super.onCreateView(inflater,container,savedInstanceState);
        submitButton.setText("Login");


        return inflater.inflate(R.layout.fragment_activity_login, container, false);
    }


    protected  int getLayout(){return R.layout.activity_main;}
}
