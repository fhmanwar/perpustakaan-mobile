package com.example.perpustakaan;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {

    private EditText txtUsername, txtPassword;
    private Button btnLogin, btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        txtUsername = findViewById(R.id.txtUname);
        txtPassword = findViewById(R.id.txtPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegis = findViewById(R.id.btnRegis);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(Login.this, Register.class);
                startActivity(daftar);
                finish();
            }
        });
    }

    private void login(){
        final String userkode = txtUsername.getText().toString().trim();
        final String password = txtPassword.getText().toString().trim();

//        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_DATA, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                if (response.contains("Success")) {
//                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
//                    SharedPreferences sharedPreferences = getSharedPreferences("Login", MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPreferences.edit();
//                    editor.putString("User", userkode);
//                    editor.putString("Sesi", "Login");
//                    editor.commit();
//                    editor.apply();
//                    Intent intent = new Intent(Login.this, BottomMenu.class);
//                    startActivity(intent);
//                    finish();
//                } else {
//                    checkLogin();
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(getApplicationContext(), "Server Error", Toast.LENGTH_LONG).show();
//            }
//        }) {
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> params = new HashMap<>();
//                params.put("kode", userkode);
//                params.put("password", password);
//                return params;
//            }
//        };
//        Volley.newRequestQueue(this).add(stringRequest);
    }

    private void checkLogin(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Login.this, android.R.style.Theme_Material_Light_Dialog_Alert);
        builder.setTitle("Maaf!")
                .setMessage("Kode Relawan/Pasword Salah");
        AlertDialog alert = builder.create();
        alert.show();
    }
}
