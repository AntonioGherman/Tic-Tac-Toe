package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alegere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alegere);
    }

    public void usorClick(View view){
        Intent intent=new Intent(alegere.this,mod_mediu.class);
        startActivity(intent);

    }

    public void mediuClick(View view){
        Intent intent=new Intent(alegere.this,ModGreu.class);
        startActivity(intent);

    }
}