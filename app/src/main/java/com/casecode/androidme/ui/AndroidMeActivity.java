package com.casecode.androidme.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.casecode.androidme.R;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);
    }
}
