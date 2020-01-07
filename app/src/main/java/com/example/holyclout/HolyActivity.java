package com.example.holyclout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class HolyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.frag_container);

        if(fragment == null){
            fragment = new HolyFragment();
            fragmentManager
                .beginTransaction()
                .add(R.id.frag_container, fragment)
                .commit();

        }
    }
}
