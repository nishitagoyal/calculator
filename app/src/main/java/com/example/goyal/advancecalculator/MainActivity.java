package com.example.goyal.advancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity{
    LinearLayout linearLayout;
    EditText editText1;
    TextView textview;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
    buttonDec,buttonEq,buttonAdd,buttonSub,buttonMul,buttonDiv,button;
    public double valueOne, valueTwo,result;
    public int currentAction;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.layout);
        button1= findViewById(R.id.one);
        button2= findViewById(R.id.two);
        button3= findViewById(R.id.three);
        button4= findViewById(R.id.four);
        button5= findViewById(R.id.five);
        button6= findViewById(R.id.six);
        button7= findViewById(R.id.seven);
        button8= findViewById(R.id.eight);
        button9= findViewById(R.id.nine);
        button0= findViewById(R.id.zero);
        buttonDec= findViewById(R.id.decimal);
        buttonEq= findViewById(R.id.equal);
        buttonAdd= findViewById(R.id.add);
        buttonSub= findViewById(R.id.subtract);
        buttonMul= findViewById(R.id.mul);
        buttonDiv= findViewById(R.id.div);
        editText1=findViewById(R.id.edt1);
        textview=findViewById(R.id.text);
        handleclick();
    }
    public void handleclick()
    {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              editText1.setText(editText1.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "0");
            }
        });
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + ".");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAction= 1;
                valueOne = Double.parseDouble(editText1.getText().toString());
                editText1.setText("");
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAction= 2;
                valueOne = Double.parseDouble(editText1.getText().toString());
                editText1.setText("");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAction= 3;
                valueOne = Double.parseDouble(editText1.getText().toString());
                editText1.setText("");
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAction= 4;
                valueOne = Double.parseDouble(editText1.getText().toString());
                editText1.setText("");
            }
        });
        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //currentAction= 1;
                valueTwo = Double.parseDouble(editText1.getText().toString());
                if (currentAction == 1)
                {
                    result=valueOne+valueTwo;
                    String answer =  Double.toString(result);
                    textview.setText(answer);
                    editText1.setText("");
                }
                if (currentAction == 2)
                {
                    result=valueOne-valueTwo;
                    String answer =  Double.toString(result);
                    textview.setText(answer);
                    editText1.setText("");
                }
                if (currentAction == 3)
                {
                    result=valueOne*valueTwo;
                    String answer =  Double.toString(result);
                    textview.setText(answer);
                    editText1.setText("");
                }
                if (currentAction == 4)
                {
                    result=valueOne/valueTwo;
                    String answer =  Double.toString(result);
                    textview.setText(answer);
                    editText1.setText("");
                }
            }
        });

    }


}
