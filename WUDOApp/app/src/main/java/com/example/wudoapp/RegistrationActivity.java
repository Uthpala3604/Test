package com.example.wudoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void SignUp(View view) {
        startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
    }

    public void SignIn(View view) {
        startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
    }
}