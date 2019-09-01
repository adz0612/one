package com.example.basic_calc;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
private EditText num1 , num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button plus = (findViewById(R.id.button));
        Button minus = (findViewById(R.id.button2));
       final TextView lastCalc = (findViewById(R.id.textView3));


        num1 = (findViewById(R.id.editText));
        num2 = (findViewById(R.id.editText2));

      //  final TextView result = (findViewById(R.id.textView));
        final  TextView disp_res = (findViewById(R.id.textView2));


        Button clear = findViewById(R.id.button3);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1.setText("");
                num2.setText("");
                disp_res.setText("");

            }
        });


        minus.setText("Subtract");

        plus.setText("Add");





        plus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            float a ,b, sum;
            String num1_string = num1.getText().toString();
            String num2_string = num2.getText().toString();


            if (num1_string.isEmpty() ||  num2_string.isEmpty()  ){

                Toast toast = Toast.makeText(MainActivity.this,"Please Enter both the numbers", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                return;

            }


            a = Float.parseFloat(num1_string);
            b = Float.parseFloat(num2_string);
            sum = a + b;
            disp_res.setText("The sum of the numbers ( a + b ) is: \n"+sum);
           // result.setText("The sum of the numbers is: ");
            lastCalc.setText("Your last Calculation was:\n  " + ""+a +" + " + ""+b +" = " +sum );


        }
    });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float a ,b,  minus;
                String num1_string = num1.getText().toString();
                String num2_string = num2.getText().toString();


                if (num1_string.isEmpty() ||  num2_string.isEmpty()  ){

                    Toast toast = Toast.makeText(MainActivity.this,"Please Enter both the numbers", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    return;

                }

                a = Float.parseFloat(num1_string);
                b = Float.parseFloat(num2_string);
                minus = a - b;


                disp_res.setText("The diff ( a - b ) of the numbers is:  \n\n"+minus);
                //result.setText("The diff of the numbers is: ");


                lastCalc.setText("Your last Calculation was:  \n" + ""+a +" - " + ""+b +" = " +minus );

            }
        });





    }
}
