package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnDot,btnEql,btnClr;
    EditText panel;
    float res1,res2;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDot = (Button)findViewById(R.id.btnDot);
        btnEql = (Button)findViewById(R.id.btnEql);
        btnClr = (Button)findViewById(R.id.btnClr);
        panel = (EditText)findViewById(R.id.panelText);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText(panel.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(panel==null)
                {
                    panel.setText("");
                }
                else
                {
                    res1 = Float.parseFloat(panel.getText()+"");
                    Add = true;
                    panel.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(panel==null)
                {
                    panel.setText("");
                }
                else
                {
                    res1 = Float.parseFloat(panel.getText()+"");
                    Sub = true;
                    panel.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(panel==null)
                {
                    panel.setText("");
                }
                else
                {
                    res1 = Float.parseFloat(panel.getText()+"");
                    Mul = true;
                    panel.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(panel==null)
                {
                    panel.setText("");
                }
                else
                {
                    res1 = Float.parseFloat(panel.getText()+"");
                    Div = true;
                    panel.setText(null);
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(String.valueOf(panel.getText()));

                if(Add)
                {
                    panel.setText((res1+res2)+"");
                    Add = false;
                }
                if(Sub)
                {
                    panel.setText((res1-res2)+"");
                    Sub = false;
                }
                if(Mul)
                {
                    panel.setText((res1*res2)+"");
                    Mul = false;
                }
                if(Div)
                {
                    panel.setText((res1/res2)+"");
                    Div = false;
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                panel.setText("");
            }
        });
    }
}