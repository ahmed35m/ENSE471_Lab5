package com.example.ahmed35m.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.ahmed35m.myapplication.R.id.display;
import static com.example.ahmed35m.myapplication.R.id.wrap_content;

public class MainActivity extends AppCompatActivity {

    protected String dtext= " ";
    TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText = (TextView) findViewById(R.id.display);
    }

    public void addE(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        dtext =dtext+ "E";
        editText.setText(dtext);

    }

    public void add0(View view) {
        dtext =dtext+ "0";
        editText.setText(dtext);
    }

    public void addEq(View view) {
        cls(view);
        dtext =dtext+ "Answer";
        editText.setText(dtext);
    }

    public void addPoint(View view) {
        dtext =dtext+ ".";
        editText.setText(dtext);
    }

    public void add9(View view) {
        dtext =dtext+ "9";
        editText.setText(dtext);
    }

    public void add8(View view) {
        dtext =dtext+ "8";
        editText.setText(dtext);
    }

    public void add7(View view) {
        dtext =dtext+ "7";
        editText.setText(dtext);
    }


    public void addDiv(View view) {

        dtext =dtext+ "/";
        editText.setText(dtext);}

    public void add6(View view) {
        dtext =dtext+ "6";
        editText.setText(dtext);
    }

    public void add5(View view) {
        dtext =dtext+ "5";
        editText.setText(dtext);
    }

    public void add4(View view) {
        dtext =dtext+ "4";
        editText.setText(dtext);
    }

    public void addMult(View view) {
        dtext =dtext+ "*";
        editText.setText(dtext);
    }

    public void add3(View view) {
        dtext =dtext+ "3";
        editText.setText(dtext);
    }

    public void add2(View view) {
        dtext =dtext+ "2";
        editText.setText(dtext);
    }

    public void add1(View view) {
        dtext =dtext+ "1";
        editText.setText(dtext);
    }


    public void addPlus(View view) {
        dtext =dtext+ "+";
        editText.setText(dtext);
    }

    public void addMinus(View view) {
        dtext =dtext+ "-";
        editText.setText(dtext);
    }

    public void addB2(View view) {
        dtext =dtext+ ")";
        editText.setText(dtext);
    }

    public void addB1(View view) {
        dtext =dtext+ "(";
        editText.setText(dtext);
    }

    public void cls(View view) {
        dtext =" ";
        editText.setText(dtext);

    }

    public void delete(View view) {
        int last=dtext.length();
        if (last != 0) {
            dtext = dtext.substring(0, last - 1);
            editText.setText(dtext);
        }
    }
}
