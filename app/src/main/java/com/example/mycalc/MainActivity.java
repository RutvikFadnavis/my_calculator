package com.example.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public String sign = "";
    public String total = "";
    public Double tempDouble, tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tempDouble = 0.0;
        tempDouble2 = 0.0;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonE = (Button) findViewById(R.id.buttonE);

        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonS = (Button) findViewById(R.id.buttonS);
        Button buttonM = (Button) findViewById(R.id.buttonM);
        Button buttonD = (Button) findViewById(R.id.buttonD);

        // Button0 event handler
        button0.setOnClickListener(
                // Button0 interface
                new Button.OnClickListener() {

                    //Button0 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        // Button1 event handler
        button1.setOnClickListener(
                // Button1 interface
                new Button.OnClickListener() {

                    //Button1 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );

        // Button2 event handler
        button2.setOnClickListener(
                // Button0 interface
                new Button.OnClickListener() {

                    //Button2 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );

        // Button3 event handler
        button3.setOnClickListener(
                // Button3 interface
                new Button.OnClickListener() {

                    //Button3 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );

        // Button4 event handler
        button4.setOnClickListener(
                // Button4interface
                new Button.OnClickListener() {

                    //Button4 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );

        // Button5 event handler
        button5.setOnClickListener(
                // Button5 interface
                new Button.OnClickListener() {

                    //Button5 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );

        // Button6 event handler
        button6.setOnClickListener(
                // Button6 interface
                new Button.OnClickListener() {

                    //Button6 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );

        // Button7 event handler
        button7.setOnClickListener(
                // Button7 interface
                new Button.OnClickListener() {

                    //Button7 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );

        // Button8 event handler
        button8.setOnClickListener(
                // Button8 interface
                new Button.OnClickListener() {

                    //Button8 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );

        // Button9 event handler
        button9.setOnClickListener(
                // Button9 interface
                new Button.OnClickListener() {

                    //Button9 callback method
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );

        //ButtonC event handker
        buttonC.setOnClickListener(
                //ButtonC interface
                new Button.OnClickListener()
                {
                    //ButtonC callback method
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.setText("");
                        tempDouble = 0.0;
                        tempDouble2 = 0.0;
                    }
                }
        );

        //ButtonA event handker
        buttonA.setOnClickListener(
                //ButtonA interface
                new Button.OnClickListener()
                {
                    //ButtonA callback method
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = tempDouble + Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "+";
                    }
                }
        );

        //ButtonS event handker
        buttonS.setOnClickListener(
                //ButtonS interface
                new Button.OnClickListener()
                {
                    //ButtonS callback method
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = tempDouble -  Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "-";
                    }
                }
        );

        //ButtoM event handker
        buttonM.setOnClickListener(
                //ButtonM interface
                new Button.OnClickListener()
                {
                    //ButtonA callback method
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = tempDouble * Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "*";
                    }
                }
        );

        //ButtonD event handker
        buttonD.setOnClickListener(
                //ButtonD interface
                new Button.OnClickListener()
                {
                    //ButtonA callback method
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = tempDouble / Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "/";
                    }
                }
        );

        //ButtonE
        buttonE.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+")
                        {
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        }
                        else if (sign == "-")
                        {
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        }
                        else if (sign == "*")
                        {
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        }
                        else if (sign == "/")
                        {
                            if (tempDouble2 == 0)
                            {
                                output.setText("Cannot Divide by zero!");
                            }
                            else
                                {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }
                        // Reset sign
                        sign = "";
                    }
                }
        );

    }
}