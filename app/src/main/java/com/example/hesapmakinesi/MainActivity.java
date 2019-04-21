package com.example.hesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

import net.objecthunter.exp4j.*;

public class MainActivity extends AppCompatActivity {
    private TextView sonuc;
    private String yazi="";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sonuc=(TextView)findViewById(R.id.textView);

        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);

        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        Button b5=(Button)findViewById(R.id.button5);
        Button b6=(Button)findViewById(R.id.button6);
        Button b7=(Button)findViewById(R.id.button7);
        Button b8=(Button)findViewById(R.id.button8);
        Button b9=(Button)findViewById(R.id.button9);
        Button b10=(Button)findViewById(R.id.button10);
        Button b11=(Button)findViewById(R.id.button11);
        Button b12=(Button)findViewById(R.id.button12);
        Button b13=(Button)findViewById(R.id.button13);
        Button b14=(Button)findViewById(R.id.button14);
        Button b15=(Button)findViewById(R.id.button15);
        Button b16=(Button)findViewById(R.id.button16);
        Button b17=(Button)findViewById(R.id.button17);
        Button b19=(Button)findViewById(R.id.button19);
        Button b20=(Button)findViewById(R.id.button20);



        final HorizontalScrollView s=(HorizontalScrollView)findViewById(R.id.ab) ;



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi= "";
               yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "(";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= ")";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "+";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "7";

                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "8";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "9";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "-";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "4";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "5";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "6";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "/";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "1";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "2";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "3";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "*";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= "0";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yazi+= ".";
                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Expression e = new ExpressionBuilder(yazi)
                        .variables()
                        .build();
                double result = e.evaluate();


                yazi=result+"";

                yenile();
                s.post(new Runnable() {
                    public void run() {
                        s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    }
                });
            }
        });

    }



    private void yenile(){
        sonuc.setText(yazi);
    }




}
