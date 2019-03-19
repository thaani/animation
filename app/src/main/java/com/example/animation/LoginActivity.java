package com.example.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       tb= findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setSubtitle("Login");
        findViewById(R.id.go_reg_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRegistrationClick();

            }
        });

    }
    private void handleRegistrationClick(){
        Intent i =  new Intent();
        i.setClass(this, RegistrationActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.blink, R.anim.bounce);
    }
}
