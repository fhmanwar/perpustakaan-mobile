package com.example.perpustakaan;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomNav extends AppCompatActivity {
    private TextView mTextMessage;

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    fragment = new Home();
//                    getSupportFragmentManager().beginTransaction().
//                            replace(R.id.containerFragment, fragment, fragment.getClass().getSimpleName()).commit();
                    setContentView(R.layout.activity_home);
                    mTextMessage.setText(R.string.title_setting);
                    return true;
                case R.id.navigation_account:
//                    Intent Acc = new Intent(String.valueOf(Login.class));
//                    startActivity(Acc);
//                    finish();
                    setContentView(R.layout.activity_login);
                    return true;
                case R.id.navigation_setting:
//                    mTextMessage.setText(R.string.title_setting);
                    setContentView(R.layout.activity_register);
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
