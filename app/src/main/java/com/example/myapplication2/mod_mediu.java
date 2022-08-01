package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Random;

public class mod_mediu extends AppCompatActivity implements View.OnClickListener {


    Button[] butoane = new Button[9];
    Random aleat = new Random();
    int i, j, castig = 9;
    static int nrMutari = 0;
    int[] poziti = new int[9];
    Win win;
    Lose lose;
    Same same;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_usor);
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

        switch (v.getId()) {

            case R.id.buton0: {
               if (poziti[0]==9) {
                   butoane[0].setText("X");
                   nrMutari++;
                   poziti[0] = 1;
                   if (nrMutari < 9) {
                       do {
                           j = aleat.nextInt(9);
                           if (j == 4) {
                               j = aleat.nextInt(9);
                           } else if (j == 5) {
                               j = aleat.nextInt(9);
                           } else if (j == 7) {
                               j = aleat.nextInt(9);
                           } else if (j == 8) {
                               j = aleat.nextInt(9);
                           }
                           if (poziti[2] == 0 && butoane[1].getText().toString().compareTo(" ") == 0) {
                               j = 1;
                           }
                       } while ((butoane[j].getText().toString().compareTo(" ") != 0) && nrMutari <= 9);

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
                        do {
                            j = aleat.nextInt(9);
                            if (j == 3) {
                                j = aleat.nextInt(9);
                            } else if (j == 5) {
                                j = aleat.nextInt(9);
                            } else if (j == 6) {
                                j = aleat.nextInt(9);
                            } else if (j == 8) {
                                j = aleat.nextInt(9);
                            }
                            if (poziti[2] == 0 && butoane[0].getText().toString().compareTo(" ") == 0) {
                                j = 0;
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
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
                        do {
                            j = aleat.nextInt(9);
                            if (j == 3) {
                                j = aleat.nextInt(9);
                            } else if (j == 4) {
                                j = aleat.nextInt(9);
                            } else if (j == 6) {
                                j = aleat.nextInt(9);
                            } else if (j == 7) {
                                j = aleat.nextInt(9);
                            }
                            if (poziti[0] == 0 && butoane[1].getText().toString().compareTo(" ") == 0) {
                                j = 1;
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton3: {
                if(poziti[3]==9) {
                    butoane[3].setText("X");
                    nrMutari++;
                    poziti[3] = 1;
                    if (nrMutari < 9) {
                        do {
                            j = aleat.nextInt(9);
                            if (j == 1) {
                                j = aleat.nextInt(9);
                            } else if (j == 2) {
                                j = aleat.nextInt(9);
                            } else if (j == 7) {
                                j = aleat.nextInt(9);
                            } else if (j == 8) {
                                j = aleat.nextInt(9);
                            }
                            if (poziti[5] == 0 && butoane[4].getText().toString().compareTo(" ") == 0) {
                                j = 4;
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton4: {
                if (poziti[4]==9) {
                    butoane[4].setText("X");
                    nrMutari++;
                    poziti[4] = 1;

                    if (nrMutari < 9) {
                        do {
                            j = aleat.nextInt(9);
                            if (j == 1) {
                                j = aleat.nextInt(9);
                            } else if (j == 3) {
                                j = aleat.nextInt(9);
                            } else if (j == 5) {
                                j = aleat.nextInt(9);
                            } else if (j == 7) {
                                j = aleat.nextInt(9);
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
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
                        do {
                            j = aleat.nextInt(9);
                            if (j == 0) {
                                j = aleat.nextInt(9);
                            } else if (j == 1) {
                                j = aleat.nextInt(9);
                            } else if (j == 6) {
                                j = aleat.nextInt(9);
                            } else if (j == 7) {
                                j = aleat.nextInt(9);
                            }
                            if (poziti[4] == 0 && butoane[3].getText().toString().compareTo(" ") == 0) {
                                j = 3;
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
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
                        do {
                            j = aleat.nextInt(9);
                            if (j == 1) {
                                j = aleat.nextInt(9);
                            } else if (j == 2) {
                                j = aleat.nextInt(9);
                            } else if (j == 4) {
                                j = aleat.nextInt(9);
                            } else if (j == 5) {
                                j = aleat.nextInt(9);
                            }
                            if (poziti[7] == 0 && butoane[8].getText().toString().compareTo(" ") == 0) {
                                j = 8;
                            } else if (poziti[8] == 0 && butoane[7].getText().toString().compareTo(" ") == 0) {
                                j = 7;
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
                        butoane[j].setText("0");
                        nrMutari++;
                        poziti[j] = 0;
                    }
                }
                break;
            }
            case R.id.buton7: {
                if(poziti[7]==9) {
                    butoane[7].setText("X");
                    nrMutari++;
                    poziti[7] = 1;

                    if (nrMutari < 9) {
                        do {
                            j = aleat.nextInt(9);
                            if (j == 0) {
                                j = aleat.nextInt(9);
                            } else if (j == 2) {
                                j = aleat.nextInt(9);
                            } else if (j == 3) {
                                j = aleat.nextInt(9);
                            } else if (j == 5) {
                                j = aleat.nextInt(9);
                            }
                            if (poziti[6] == 0 && butoane[8].getText().toString().compareTo(" ") == 0) {
                                j = 8;
                            } else if (poziti[8] == 0 && butoane[6].getText().toString().compareTo(" ") == 0) {
                                j = 6;
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
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
                        do {
                            j = aleat.nextInt(9);
                            if (j == 0) {
                                j = aleat.nextInt(9);
                            } else if (j == 1) {
                                j = aleat.nextInt(9);
                            } else if (j == 3) {
                                j = aleat.nextInt(9);
                            } else if (j == 4) {
                                j = aleat.nextInt(9);
                            }
                            if (poziti[7] == 0 && butoane[6].getText().toString().compareTo(" ") == 0) {
                                j = 6;
                            } else if (poziti[6] == 0 && butoane[7].getText().toString().compareTo(" ") == 0) {
                                j = 7;
                            }
                        } while (butoane[j].getText().toString().compareTo(" ") != 0 && nrMutari <= 9);
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
        castig = verifica(poziti);
        if (castig == 1) {
            win = new Win(mod_mediu.this);
            win.setCancelable(false);
            win.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            win.show();
        } else if (castig == 0) {
            lose = new Lose(mod_mediu.this);
            lose.setCancelable(false);
            lose.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            lose.show();
        } else if (nrMutari >= 9) {
            same = new Same(mod_mediu.this);
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
        Intent intent = new Intent(mod_mediu.this, MainActivity.class);
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