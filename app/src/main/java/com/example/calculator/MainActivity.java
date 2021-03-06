package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button zero;
    private Button equalto;
    private Button clean;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char substraction = '-';
    private final char multiplication = '*';
    private final char division = '/';
    private final char EQU = 0;
    private  double val1 = Double.NaN;
    private  double val2;
    private  char ACTION;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"+");
                info.setText(null);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=substraction;
                result.setText(String.valueOf(val1)+"-");
                info.setText(null);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=multiplication;
                result.setText(String.valueOf(val1)+"*");
                info.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=division;
                result.setText(String.valueOf(val1)+"/");
                info.setText(null);

            }
        });
        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString()+String.valueOf(val2) + "=" +String.valueOf(val1));
                info.setText(null);

            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (info.getText().length()>0)
                {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }

            }
        });

    }

    private void setupUIViews() {

        zero = (Button) findViewById(R.id.button15);
        one = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button8);
        five = (Button) findViewById(R.id.button9);
        six = (Button) findViewById(R.id.button10);
        seven = (Button) findViewById(R.id.button11);
        eight = (Button) findViewById(R.id.button12);
        nine = (Button) findViewById(R.id.button13);
        add = (Button) findViewById(R.id.button14);
        sub = (Button) findViewById(R.id.button16);
        mul = (Button) findViewById(R.id.button19);
        div = (Button) findViewById(R.id.button17);
        equalto = (Button) findViewById(R.id.button20);
        clean = (Button) findViewById(R.id.button18);
        info = (TextView) findViewById(R.id.textView);
        result = (TextView) findViewById(R.id.textView2);
    }
    private void compute(){
        try {
            if (!Double.isNaN(val1)) {
                val2 = Double.parseDouble(info.getText().toString());
                switch (ACTION) {
                    case ADDITION:
                        val1 = val1 + val2;
                        break;
                    case multiplication:
                        val1 = val1 * val2;
                        break;
                    case substraction:
                        val1 = val1 - val2;
                        break;
                    case division:
                        val1 = val1 / val2;
                        break;
                    case EQU:
                        break;

                }
            } else {
                val1 = Double.parseDouble(info.getText().toString());
            }
        }catch (Exception Ex){
            info.setText("Syntax Error");
        }
    }



     }
