package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    TextView nume1,nume2,scor1,scor2;
    String numeJucator1,numeJucator2;
    Button[] butoane = new Button[9];
    int i, j, castig = 9;
    static int nrMutari = 0,pct1=0,pct2=0;
    boolean jucator=true;
    int[] poziti = new int[9];
    Win win;
    Same same;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nume1=findViewById(R.id.jucator1);
        nume2=findViewById(R.id.jucator2);
        scor1=findViewById(R.id.scor1);
        scor2=findViewById(R.id.scor2);

        numeJucator1=getIntent().getStringExtra("jucator1");
        numeJucator2=getIntent().getStringExtra("jucator2");

        nume1.setText(numeJucator1);
        nume2.setText(numeJucator2);
        Arrays.fill(poziti, 9);
        for (i = 0; i < 9; i++) {
            String butonID = "buton" + i;
            int id = getResources().getIdentifier(butonID, "id", getPackageName());
            butoane[i] = findViewById(id);
            butoane[i].setOnClickListener(this);

        }




    }

    @Override
    public void onClick(View v) {
       if(nrMutari%2==0)jucator=true;
       else jucator=false;
        switch (v.getId()) {

            case R.id.buton0: {
                if (jucator) {
                    if (poziti[0] == 9) {
                        butoane[0].setText("X");
                        nrMutari++;
                        poziti[0] = 1;
                    }
                        break;
                    }else {
                        if(poziti[0]==9){
                        butoane[0].setText("0");
                        nrMutari++;
                        poziti[0] = 0;
                        }
                        break;
                    }

            }
            case R.id.buton1: {
                if (jucator) {
                    if (poziti[1] == 9) {
                        butoane[1].setText("X");
                        nrMutari++;
                        poziti[1] = 1;
                    }
                        break;
                    } else  {
                        if(poziti[1]==9){
                            butoane[1].setText("0");
                            nrMutari++;
                            poziti[1] = 0;
                            jucator=!jucator;
                        }
                        break;
                    }

                }
            case R.id.buton2: {
                if (jucator) {
                    if (poziti[2] == 9) {
                        butoane[2].setText("X");
                        nrMutari++;
                        poziti[2] = 1;
                    }
                        break;
                    }
                    else {
                        if(poziti[2]==9){
                            butoane[2].setText("0");
                            nrMutari++;
                            poziti[2] = 0;
                        }
                        break;
                    }
            }
            case R.id.buton3: {
                if (jucator) {
                    if (poziti[3] == 9) {
                        butoane[3].setText("X");
                        nrMutari++;
                        poziti[3] = 1;
                    }
                        break;
                    }
                    else {
                        if(poziti[3]==9){
                            butoane[3].setText("0");
                            nrMutari++;
                            poziti[3] = 0;

                        }
                        break;
                    }
            }
            case R.id.buton4: {
                if (jucator) {
                    if (poziti[4] == 9) {
                        butoane[4].setText("X");
                        nrMutari++;
                        poziti[4] = 1;
                    }
                        break;
                    }
                    else {
                        if(poziti[4]==9){
                            butoane[4].setText("0");
                            nrMutari++;
                            poziti[4] = 0;
                        }
                        break;
                    }
            }
            case R.id.buton5: {
                if (jucator) {
                    if (poziti[5] == 9) {
                        butoane[5].setText("X");
                        nrMutari++;
                        poziti[5] = 1;
                    }
                        break;
                    }
                    else {
                        if(poziti[5]==9){
                            butoane[5].setText("0");
                            nrMutari++;
                            poziti[5] = 0;

                        }
                        break;
                    }
            }
            case R.id.buton6: {
                if (jucator) {
                    if (poziti[6] == 9) {
                        butoane[6].setText("X");
                        nrMutari++;
                        poziti[6] = 1;
                    }
                        break;
                    }
                    else {
                        if(poziti[6]==9){
                            butoane[6].setText("0");
                            nrMutari++;
                            poziti[6] = 0;

                        }
                        break;
                    }
            }
            case R.id.buton7: {
                if (jucator) {
                    if (poziti[7] == 9) {
                        butoane[7].setText("X");
                        nrMutari++;
                        poziti[7] = 1;
                    }
                        break;
                    }
                    else {
                        if(poziti[7]==9){
                            butoane[7].setText("0");
                            nrMutari++;
                            poziti[7] = 0;

                        }
                        break;
                    }
            }
            case R.id.buton8: {
                if (jucator) {
                    if (poziti[8] == 9) {
                        butoane[8].setText("X");
                        nrMutari++;
                        poziti[8] = 1;
                        }
                    break;
                    }
                    else {
                        if(poziti[8]==9){
                            butoane[8].setText("0");
                            nrMutari++;
                            poziti[8] = 0;
                        }
                        break;
                    }

            }
            default: {

                break;
            }
        }
        castig = verifica(poziti);
        if (castig == 1) {
            win = new Win(MainActivity2.this);
            win.setCancelable(false);
            win.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            win.show();
            Toast.makeText(MainActivity2.this,numeJucator1+" a castigat",Toast.LENGTH_SHORT).show();
            pct1++;
            scor1.setText(Integer.toString(pct1));
        } else if (castig == 0) {
            win = new Win(MainActivity2.this);
            win.setCancelable(false);
            win.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            win.show();
            Toast.makeText(MainActivity2.this,numeJucator2+" a castigat",Toast.LENGTH_SHORT).show();
            pct2++;
            scor2.setText(Integer.toString(pct2));
        } else if (nrMutari >= 9) {
            same = new Same(MainActivity2.this);
            same.setCancelable(false);
            same.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            same.show();
        }


    }

    public int verifica(int[] poziti) {
        if (poziti[0] + poziti[1] + poziti[2] == 3 || poziti[3] + poziti[4] + poziti[5] == 3 || poziti[6] + poziti[7] + poziti[8] == 3
                || poziti[0] + poziti[3] + poziti[6] == 3 || poziti[1] + poziti[4] + poziti[7] == 3 || poziti[2] + poziti[5] + poziti[8] == 3
                || poziti[0] + poziti[4] + poziti[8] == 3 || poziti[2] + poziti[4] + poziti[6] == 3)
            return 1;
        else if (poziti[0] + poziti[1] + poziti[2] == 0 || poziti[3] + poziti[4] + poziti[5] == 0 || poziti[6] + poziti[7] + poziti[8] == 0
                || poziti[0] + poziti[3] + poziti[6] == 0 || poziti[1] + poziti[4] + poziti[7] == 0 || poziti[2] + poziti[5] + poziti[8] == 0
                || poziti[0] + poziti[4] + poziti[8] == 0 || poziti[2] + poziti[4] + poziti[6] == 0)
            return 0;
        return 9;

    }

    public void inapoi(View v) {
        reset(v);

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }

    public void reset(View v) {
        for (i = 0; i < 9; i++) {
            butoane[i].setText(" ");
        }
        Arrays.fill(poziti, 9);
        nrMutari = 0;

    }


}