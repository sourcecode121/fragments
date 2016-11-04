package com.example.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements FragmentNo1.Fragment1Callback {

    private FragmentNo2 fragmentNo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adding fragment at runtime
        if(findViewById(R.id.fragment_container) != null) {
            if(savedInstanceState == null) {
                fragmentNo2 = new FragmentNo2();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container, fragmentNo2)
                        .commit();
            }
        }
    }

    @Override
    public void callback1(String message) {
        fragmentNo2.updateTextView(message);
    }
}
