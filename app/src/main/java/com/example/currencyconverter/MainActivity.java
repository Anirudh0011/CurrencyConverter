package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClkFun(View view){

        Log.i("info","Button Pressed");
        EditText editText=(EditText) findViewById(R.id.e1);

        String amountinRupees = editText.getText().toString();
        double amountinRupeesDouble = Double.parseDouble(amountinRupees);
        double amountinDollarDouble = amountinRupeesDouble * 71.20;

        String amountinDollarsString = String.format("%.2f", amountinDollarDouble);
        Toast.makeText(this, "₹" + amountinRupees +" is $" + amountinDollarsString, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
