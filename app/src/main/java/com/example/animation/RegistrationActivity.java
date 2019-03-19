package com.example.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setSubtitle("Registration");
        findViewById(R.id.go_login_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLoginClick();
            }
        });


    }
    private void handleLoginClick(){
        Intent i =  new Intent();
        i.setClass(this, LoginActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
