package com.example.myapplication2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

public class Lose extends Dialog {
    public Lose(@NonNull Context context) {
        super(context);
    }

    Button meniu,jocNou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pierzator);

        meniu=findViewById(R.id.ok);

        meniu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
