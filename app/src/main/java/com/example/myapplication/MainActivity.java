package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is a verbose log");
        Log.d(TAG, "This is a debug log");
        Log.i(TAG, "This is an info log");
        Log.w(TAG, "This is a warn log");
        Log.e(TAG, "This is a error log");

    }
}