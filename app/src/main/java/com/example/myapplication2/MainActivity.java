package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }

   public void android(View v){
        Intent intent=new Intent(MainActivity.this,alegere.class);
        startActivity(intent);
   }

    public void twoVtwoClick(View v){
        Intent intent =new Intent(MainActivity.this,info_page.class);
        startActivity(intent);
    }
}