package com.example.holyclout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class HolyActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new HolyFragment();
    }
}
