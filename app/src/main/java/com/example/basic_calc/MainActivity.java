package com.example.basic_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a ,b,c;

        Button plus = (findViewById(R.id.button));
        Button minus = (findViewById(R.id.button2));

      final  EditText num1 = (findViewById(R.id.editText));
     final   EditText num2 = (findViewById(R.id.editText2));


       final TextView result = (findViewById(R.id.textView));
      final  TextView disp_res = (findViewById(R.id.textView2));





plus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int a ,b, random;



        a = Integer.parseInt(num1.getText().toString());

        b = Integer.parseInt(num2.getText().toString());



        random = a + b;


        disp_res.setText(""+random);
        result.setText("The sum of the numbers is: ");




    }
});

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a ,b,  random;



                a = Integer.parseInt(num1.getText().toString());

                b = Integer.parseInt(num2.getText().toString());



                random = a - b;


                disp_res.setText(""+random);
                result.setText("The diff of the numbers is: ");



            }
        });







    }
}
