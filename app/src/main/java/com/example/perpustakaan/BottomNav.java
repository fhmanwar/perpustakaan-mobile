package com.example.perpustakaan;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.perpustakaan.fragment.HistoryFragment;
import com.example.perpustakaan.fragment.HomeFragment;
import com.example.perpustakaan.fragment.ProfileFragment;

public class BottomNav extends AppCompatActivity {
    private TextView mTextMessage;

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.containerInner, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_history:
                    fragment = new HistoryFragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.containerInner, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_profile:
                    fragment = new ProfileFragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.containerInner, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView nav = findViewById(R.id.navView);
//        mTextMessage = findViewById(R.id.message);
        nav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if(savedInstanceState == null){
            nav.setSelectedItemId(R.id.navigation_home);
        }
    }

}
