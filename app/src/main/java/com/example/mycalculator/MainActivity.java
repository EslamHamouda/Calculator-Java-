package com.example.mycalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input;

    String sign, value1, value2;
    Double num1, num2, result;
    boolean hasDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);

        hasDot = false;

    }

    @SuppressLint("SetTextI18n")
    public void zero(View view) {
        input.setText(input.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void one(View view) {
        input.setText(input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void two(View view) {
        input.setText(input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void three(View view) {
        input.setText(input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void four(View view) {
        input.setText(input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void five(View view) {
        input.setText(input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void six(View view) {
        input.setText(input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void seven(View view) {
        input.setText(input.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void eight(View view) {
        input.setText(input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void nine(View view) {
        input.setText(input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void dot(View view) {
        if (!hasDot) {
            if (input.getText().equals("")) {

                input.setText("0.");
            } else {

                input.setText(input.getText() + ".");
            }

            hasDot = true;
        }

    }

    public void add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText("+");
        hasDot = false;
    }

    public void sub(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText("-");
        hasDot = false;
    }

    public void mul(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText("×");
        hasDot = false;
    }

    public void div(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText("÷");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void equ(View view) {
        if (sign == null) {
           input.setText("Error!");
        } else if (input.getText().equals("")) {
            input.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            input.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    break;
            }

        }
    }


    public void del(View view) {
        if (input.getText().equals("")) {
            input.setText(null);
        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }
    }

    public void clear(View view) {

        input.setText(null);
        input.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }


}

