package com.example.holyclout;

import androidx.fragment.app.Fragment;

public class HolyDeedListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new HolyDeedListFragment();
    }
}
