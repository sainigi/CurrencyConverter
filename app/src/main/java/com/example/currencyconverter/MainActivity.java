package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Formatter;
/** BY SAINI*/

public class MainActivity extends AppCompatActivity {

    Button euro,pound,dollar,yen,dinar,bitcoin,rubel,ausdollar,candollar;
    EditText editText;
    TextView textView;
    long backPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        dollar = findViewById(R.id.dollar);
        pound = findViewById(R.id.pound);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        editText = findViewById(R.id.editTextView);
        textView = findViewById(R.id.textView);


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.011;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.013;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0097;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.49;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0040;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.000000389;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.98;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.018;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else {
                    double n,k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.017;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

    }
    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            finishAffinity();
            super.onBackPressed();
            return;
        }
        else{
            Toast.makeText(this,"Press Back again to exit",Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}