package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

            public class MainActivity extends AppCompatActivity {

                EditText e1, e2;
                TextView t1;
                int num1, num2;

                @Override
                protected void onCreate(Bundle savedInstanceState)
                {
                    super.onCreate(savedInstanceState);

                    setContentView(R.layout.activity_main);
                }

                // a public method to get the input numbers
                public boolean getNumbers()
                {
                    String s1,s2;
                    // defining the edit text 1 to e1
                    e1 = (EditText)findViewById(R.id.editTextNumberDecimal);

                    // defining the edit text 2 to e2
                    e2 = (EditText)findViewById(R.id.editTextNumberDecimal2);

                    // defining the text view to t1
                    t1 = (TextView)findViewById(R.id.result);

                    // taking input from text box 1
                    s1 = e1.getText().toString();

                    // taking input from text box 2
                    s2 = e2.getText().toString();

                    // condition to check if box is not empty
                    if ((s1.equals(null) && s2.equals(null))
                            || (s1.equals("") && s2.equals(""))) {

                        String result = "Please enter a value";
                        t1.setText(result);

                        return false;
                    }
                    else {
                        // converting string to int.
                        num1 = Integer.parseInt(e1.getText().toString());

                        // converting string to int.
                        num2 = Integer.parseInt(e2.getText().toString());
                    }

                    return true;
                }

                // a public method to perform addition
                public void button(View v)
                {

                    // get the input numbers
                    if (getNumbers()) {
                        int sum = num1 + num2;
                        t1.setText(Integer.toString(sum));
                    }
                }

                // a public method to perform power function

                // a public method to perform subtraction
                public void button2(View v)
                {

                    // get the input numbers
                    if (getNumbers()) {
                        int sum = num1 - num2;
                        t1.setText(Integer.toString(sum));
                    }
                }

                // a public method to perform multiplication
                public void button3(View v)
                {

                    // get the input numbers
                    if (getNumbers()) {
                        int sum = num1 * num2;
                        t1.setText(Integer.toString(sum));
                    }
                }
                // a public method to perform Division

                // a public method to perform modulus function
                public void button4(View v)
                {

                    // get the input numbers
                    if (getNumbers()) {
                        double sum = num1/num2;
                        t1.setText(Double.toString(sum));
                    }
                }
            }




