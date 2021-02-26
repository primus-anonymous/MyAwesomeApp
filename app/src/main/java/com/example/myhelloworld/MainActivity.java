package com.example.myhelloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_digits);

        EditText numberOne = findViewById(R.id.number_one);
        EditText numberTwo = findViewById(R.id.number_two);
        Button btnCompare = findViewById(R.id.btn_compare);
        TextView result = findViewById(R.id.result);

        btnCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    Integer valueOne = Integer.valueOf(numberOne.getText().toString());
                    Integer valueTwo = Integer.valueOf(numberTwo.getText().toString());

                    if (valueOne.equals(valueTwo)) {
                        result.setText("Equal!!!");
                    } else {
                        result.setText("Not equal");
                    }
                } catch (NumberFormatException exc) {
                    result.setText("Please enter a number");
                }
            }
        });
    }
}