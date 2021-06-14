package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText text=(EditText)findViewById(R.id.editTextNumber);
        String st=text.getText().toString();
        int i=Integer.parseInt(st);
         double p=i*1.3;
         String c=String.valueOf(p);
        Toast.makeText(this, "₹"+st+" is $"+c, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}