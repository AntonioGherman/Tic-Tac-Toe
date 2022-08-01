package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Random;

import javax.security.auth.callback.PasswordCallback;

public class ModGreu extends AppCompatActivity implements View.OnClickListener{


    Button[] butoane =new Button[9];
    Random aleat=new Random();
    TextInputEditText parola;
    TextInputLayout TextParola;
    int i,j;
    static int click=0;
    int castig;
    static int nrMutari=0,nrGresit=0;
    boolean primaMutare=true;
    int[] poziti=new int[9];
    Win win;
    Lose lose;
    Same same;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_mediu);
        Arrays.fill(poziti,9);
        for(i=0;i<9;i++) {
            String butonID = "buton" + i;
            int id = getResources().getIdentifier(butonID, "id", getPackageName());
            butoane[i] = findViewById(id);
            butoane[i].setOnClickListener(this);

        }

    }

    @Override
    public void onClick(View v) {


        switch(v.getId()) {

            case R.id.buton0: {
              if(poziti[0]==9) {
                  butoane[0].setText("X");
                  nrMutari++;
                  poziti[0] = 1;
                  if (nrMutari < 9) {
                      if (butoane[4].getText().toString().compareTo(" ") == 0) {
                          j = 4;
                      } else if (poziti[3] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                          j = 6;
                      } else if (poziti[1] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                          j = 2;
                      } else if (poziti[6] == 1 && butoane[3].getText().toString().compareTo(" ") == 0) {
                          j = 3;
                      } else if (poziti[2] == 1 && butoane[1].getText().toString().compareTo(" ") == 0) {
                          j = 1;
                      } else do {
                          j = aleat.nextInt(9);
                      } while (butoane[j].getText().toString().compareTo(" ") != 0);
                      butoane[j].setText("0");
                      nrMutari++;
                      poziti[j] = 0;
                  }
              }
                break;
            }
            case R.id.buton1: {
               if(poziti[1]==9) {
                   butoane[1].setText("X");
                   nrMutari++;
                   poziti[1] = 1;
                   if (nrMutari < 9) {
                       if (butoane[4].getText().toString().compareTo(" ") == 0) {
                           j = 4;
                       } else if (poziti[0] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                           j = 2;
                       } else if (poziti[4] == 1 && butoane[7].getText().toString().compareTo(" ") == 0) {
                           j = 7;
                       } else if (poziti[3] == 1 && butoane[0].getText().toString().compareTo(" ") == 0) {
                           j = 0;
                       } else if (poziti[5] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                           j = 2;
                       } else if (poziti[2] == 1 && butoane[0].getText().toString().compareTo(" ") == 0) {
                           j = 0;
                       } else do {
                           j = aleat.nextInt(9);
                       } while (butoane[j].getText().toString().compareTo(" ") != 0);
                       butoane[j].setText("0");
                       nrMutari++;
                       poziti[j] = 0;
                   }
               }
                break;
            }
            case R.id.buton2: {
                if(poziti[2]==9) {
                    butoane[2].setText("X");
                    nrMutari++;
                    poziti[2] = 1;
                    if (nrMutari < 9) {
                        if (butoane[4].getText().toString().compareTo(" ") == 0) {
                            j = 4;
                        } else if (poziti[1] == 1 && butoane[0].getText().toString().compareTo(" ") == 0) {
                            j = 0;
                        }
                        else if(poziti[5]==1 && poziti[4]==1 && poziti[6]==9){
                            j=6;
                        }
                        else if (poziti[5] == 1 && butoane[8].getText().toString().compareTo(" ") == 0) {
                            j = 8;
                        }
                        else if (poziti[4] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (poziti[0] == 1 && butoane[1].getText().toString().compareTo(" ") == 0) {
                            j = 1;
                        } else if (poziti[8] == 1 && butoane[5].getText().toString().compareTo(" ") == 0) {
                            j = 5;
                        }

                        else do {
                            j = aleat.nextInt(9);
                        } while (butoane[j].getText().toString().compareTo(" ") != 0);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton3: {
                if (poziti[3]==9) {
                    butoane[3].setText("X");
                    nrMutari++;
                    poziti[3] = 1;
                    if (nrMutari < 9) {
                        if (butoane[4].getText().toString().compareTo(" ") == 0) {
                            j = 4;
                        } else if (poziti[4] == 1 && butoane[5].getText().toString().compareTo(" ") == 0) {
                            j = 5;
                        } else if (poziti[0] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (poziti[1] == 1 && butoane[0].getText().toString().compareTo(" ") == 0) {
                            j = 0;
                        } else if (poziti[7] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (poziti[6] == 1 && butoane[0].getText().toString().compareTo(" ") == 0) {
                            j = 0;
                        } else do {
                            j = aleat.nextInt(9);
                        } while (butoane[j].getText().toString().compareTo(" ") != 0);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton4: {
                if(poziti[4]==9) {
                    butoane[4].setText("X");
                    nrMutari++;
                    poziti[4] = 1;
                    if (nrMutari < 9) {
                        if (butoane[0].getText().toString().compareTo(" ") == 0) {
                            j = 0;
                        } else if (butoane[1].getText().toString().compareTo(" ") == 0) {
                            j = 1;
                        } else if (butoane[2].getText().toString().compareTo(" ") == 0) {
                            j = 2;
                        } else if (butoane[3].getText().toString().compareTo(" ") == 0) {
                            j = 3;
                        } else if (butoane[5].getText().toString().compareTo(" ") == 0) {
                            j = 5;
                        } else if (butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (butoane[7].getText().toString().compareTo(" ") == 0) {
                            j = 7;
                        } else if (butoane[8].getText().toString().compareTo(" ") == 0) {
                            j = 8;
                        } else do {
                            j = aleat.nextInt(9);
                        } while (butoane[j].getText().toString().compareTo(" ") != 0);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }else{
                    parola=findViewById(R.id.parola);
                    parola.setHint("Parola");
                    if(parola.getText().toString().compareTo("a15.")==0){
                        butoane[4].setText("X");
                        poziti[4]=1;
                        nrMutari++;
                        parola.setVisibility(View.INVISIBLE);
                        primaMutare=false;

                    }else if(nrGresit==0){
                        Toast.makeText(ModGreu.this,"Parola gresita",Toast.LENGTH_SHORT).show();
                        parola.setVisibility(View.INVISIBLE);
                        nrGresit++;
                    }
                }
                break;
            }
            case R.id.buton5: {
                if(poziti[5]==9) {
                    butoane[5].setText("X");
                    nrMutari++;
                    poziti[5] = 1;
                    if (nrMutari < 9) {
                        if (butoane[4].getText().toString().compareTo(" ") == 0) {
                            j = 4;
                        } else if (poziti[4] == 1 && butoane[3].getText().toString().compareTo(" ") == 0) {
                            j = 3;
                        } else if (poziti[2] == 1 && butoane[8].getText().toString().compareTo(" ") == 0) {
                            j = 8;
                        } else if (poziti[1] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                            j = 2;
                        } else if (poziti[8] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                            j = 2;
                        }
                        else if(poziti[5]==1 && butoane[8].getText().toString().compareTo(" ")==0){
                            j=8;
                        }
                        else do {
                            j = aleat.nextInt(9);
                        } while (butoane[j].getText().toString().compareTo(" ") != 0);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton6: {
                if(poziti[6]==9) {
                    butoane[6].setText("X");
                    nrMutari++;
                    poziti[6] = 1;
                    if (nrMutari < 9) {
                        if (butoane[4].getText().toString().compareTo(" ") == 0) {
                            j = 4;
                        } else if (poziti[3] == 1 && butoane[0].getText().toString().compareTo(" ") == 0) {
                            j = 0;
                        }
                        else if(poziti[7]==1 && poziti[4]==1 && poziti[2]==9){
                            j=2;
                        }
                        else if (poziti[7] == 1 && butoane[8].getText().toString().compareTo(" ") == 0) {
                            j = 8;
                        }else if (poziti[0] == 1 && butoane[3].getText().toString().compareTo(" ") == 0) {
                            j = 3;
                        }else if (poziti[4] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                            j = 2;
                        }else if (poziti[8] == 1 && butoane[7].getText().toString().compareTo(" ") == 0) {
                            j = 7;
                        }
                        else do {
                            j = aleat.nextInt(9);
                        } while (butoane[j].getText().toString().compareTo(" ") != 0);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton7: {
                if (poziti[7]==9) {
                    butoane[7].setText("X");
                    nrMutari++;
                    poziti[7] = 1;
                    if (nrMutari < 9) {
                        if (butoane[4].getText().toString().compareTo(" ") == 0) {
                            j = 4;
                        } else if (poziti[4] == 1 && butoane[1].getText().toString().compareTo(" ") == 0) {
                            j = 1;
                        } else if (poziti[6] == 1 && butoane[8].getText().toString().compareTo(" ") == 0) {
                            j = 8;
                        } else if (poziti[3] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (poziti[8] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (poziti[5] == 1 && butoane[8].getText().toString().compareTo(" ") == 0) {
                            j = 8;
                        } else do {
                            j = aleat.nextInt(9);
                        } while (butoane[j].getText().toString().compareTo(" ") != 0);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton8: {
                if(poziti[8]==9) {
                    butoane[8].setText("X");
                    nrMutari++;
                    poziti[8] = 1;
                    if (nrMutari < 9) {
                        if (butoane[4].getText().toString().compareTo(" ") == 0) {
                            j = 4;
                        } else if (poziti[7] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (poziti[5] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                            j = 2;
                        } else if (poziti[7] == 1 && butoane[6].getText().toString().compareTo(" ") == 0) {
                            j = 6;
                        } else if (poziti[5] == 1 && butoane[2].getText().toString().compareTo(" ") == 0) {
                            j = 2;
                        } else if (poziti[6] == 1 && butoane[7].getText().toString().compareTo(" ") == 0) {
                            j = 7;
                        } else if (poziti[2] == 1 && butoane[5].getText().toString().compareTo(" ") == 0) {
                            j = 5;
                        } else do {
                            j = aleat.nextInt(9);
                        } while (butoane[j].getText().toString().compareTo(" ") != 0);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            default: {

                break;
            }
        }

        castig=verifica(poziti);
        if(castig==1){
            win =new Win(ModGreu.this);
            win.setCancelable(false);
            win.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            win.show();
            if(primaMutare==false) {
                parola.setText("");
                parola.setVisibility(View.VISIBLE);
                nrGresit = 0;
            }


        }
        else if(castig==0) {
            lose=new Lose(ModGreu.this);
            lose.setCancelable(false);
            lose.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            lose.show();
            if(primaMutare==false) {
                parola.setText("");
                parola.setVisibility(View.VISIBLE);
                nrGresit = 0;
            }
        }
        else if(nrMutari>=9){
            same=new Same(ModGreu.this);
            same.setCancelable(false);
            same.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            same.show();
            if(!primaMutare) {
                parola.setText("");
                parola.setVisibility(View.VISIBLE);
                nrGresit = 0;
            }
        }


    }

    public int verifica(int[] poziti){
        if(poziti[0]+poziti[1]+poziti[2]==3 || poziti[3]+poziti[4]+poziti[5]==3 || poziti[6]+poziti[7]+poziti[8]==3
        || poziti[0]+poziti[3]+poziti[6]==3 || poziti[1]+poziti[4]+poziti[7]==3 || poziti[2]+poziti[5]+poziti[8]==3
        || poziti[0]+poziti[4]+poziti[8]==3 || poziti[2]+poziti[4]+poziti[6]==3) return 1;

        else if(poziti[0]+poziti[1]+poziti[2]==0 || poziti[3]+poziti[4]+poziti[5]==0 || poziti[6]+poziti[7]+poziti[8]==0
                    || poziti[0]+poziti[3]+poziti[6]==0 || poziti[1]+poziti[4]+poziti[7]==0 || poziti[2]+poziti[5]+poziti[8]==0
                    || poziti[0]+poziti[4]+poziti[8]==0 || poziti[2]+poziti[4]+poziti[6]==0)
                return 0;
        return 9;

    }

    public void inapoi(View view){
        reset(view);
        Intent intent=new Intent(ModGreu.this,MainActivity.class);
        startActivity(intent);
    }

    public void reset(View v){
        for(i=0;i<9;i++){
            butoane[i].setText(" ");
        }
        Arrays.fill(poziti,9);
        nrMutari=0;
        primaMutare=true;
    }


}

