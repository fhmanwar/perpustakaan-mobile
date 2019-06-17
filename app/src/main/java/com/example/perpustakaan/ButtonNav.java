package com.example.perpustakaan;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

//import com.example.perpustakaan.Login;

public class ButtonNav extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
//                case R.id.navigation_account:
//                    Intent Main = new Intent(ButtonNav.this, Login.class);
//                    startActivity(Main);
//                    finish();
//                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_nav);

        BottomNavigationView nav = findViewById(R.id.navView);
//        mTextMessage = findViewById(R.id.message);
        nav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if(savedInstanceState == null){
            nav.setSelectedItemId(R.id.navigation_home);
        }
    }

}
