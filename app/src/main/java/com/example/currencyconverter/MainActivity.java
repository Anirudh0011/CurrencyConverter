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

        String amountinDollars = editText.getText().toString();
        double amountinDollarDouble = Double.parseDouble(amountinDollars);
        double amountinRupeesDouble = amountinDollarDouble * 0.014;

        String amountinRupeesString = String.format("%.2f", amountinRupeesDouble);
        Toast.makeText(this, "₹" + amountinDollars +" is $ " + amountinRupeesString, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
