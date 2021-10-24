package com.example.calculatormine;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonC,buttonPoint,buttonPlus,buttonMinus,buttonMultiplication,buttonDivision,buttonEqual;
    TextView eddtxt;
    TextView ctr;
    Double val_One = Double.NaN;
    Double val_Two;
    //changing variables type
    final char mul = '*';
    final char div = '/';
    final char add = '+';
    final char sub = '-';
    final char equ = 0;
    char valid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);

        buttonPlus = (Button) findViewById(R.id.btnPlus);
        buttonMinus = (Button) findViewById(R.id.btnMinus);
        buttonMultiplication = (Button) findViewById(R.id.btnMultiplication);
        buttonDivision = (Button) findViewById(R.id.btnDivision);
        buttonC = (Button) findViewById(R.id.btnC);
        buttonPoint = (Button) findViewById(R.id.btnPoint);
        buttonEqual = (Button) findViewById(R.id.btnEqual);


        eddtxt = (TextView) findViewById(R.id.screen);
        ctr = (TextView)findViewById(R.id.Allo123456789);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ctr.setText(ctr.getText() + "9");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ctr.getText().length()>0){
                    CharSequence numbers = ctr.getText().toString();
                    ctr.setText(numbers.subSequence(0,numbers.length()-1));
                }else{
                    val_One=Double.NaN;
                    val_Two=Double.NaN;
                    ctr.setText(null);
                    eddtxt.setText(null);
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                valid = sub;
                eddtxt.setText(String.valueOf(val_One)+ "-");
                ctr.setText(null);
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                valid = add;
                eddtxt.setText(String.valueOf(val_One)+ "+");
                ctr.setText(null);
            }
        });
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                valid = mul;
                eddtxt.setText(String.valueOf(val_One)+ "*");
                ctr.setText(null);
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                valid=div;
                eddtxt.setText(String.valueOf(val_One)+ "/");
                ctr.setText(null);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                valid=equ;
                eddtxt.setText(eddtxt.getText().toString() + String.valueOf(val_Two) + "="+ String.valueOf(val_One));
                ctr.setText(null);
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eddtxt.setText(String.valueOf(val_One)+ ".");
            }
        });
    }

    private void calculate(){
        if (!Double.isNaN(val_One)) {
            val_Two = Double.parseDouble(ctr.getText().toString());

            switch (valid){
                case add:
                    val_One = val_One + val_Two;
                    break;
                case sub:
                    val_One = val_One - val_Two;
                    break;
                case mul:
                    val_One = val_One * val_Two;
                    break;
                case div:
                    val_One = val_One / val_Two;
                    break;
                case equ:
                    break;
            }
        }else{
            val_One = Double.parseDouble(ctr.getText().toString());
        }
    }

}