package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class info_page extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
        Button play=findViewById(R.id.play);

        play.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText getjucator1=findViewById(R.id.numeJucator1);
        EditText getjucator2=findViewById(R.id.numeJucator2);
        Intent intent=new Intent(info_page.this,MainActivity2.class);
       String nume1=getjucator1.getText().toString();
       String nume2=getjucator2.getText().toString();

        intent.putExtra("jucator1",nume1);
        intent.putExtra("jucator2",nume2);
        startActivity(intent);
    }
}