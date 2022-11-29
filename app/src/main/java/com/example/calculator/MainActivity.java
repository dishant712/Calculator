package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    Button b1,b2,b3,b4,b5;
    EditText et1,et2;

    //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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.t);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String a1= et1.getText().toString();
                String a2 = et2.getText().toString();

                int n1 = Integer.parseInt(a1);
                int n2 = Integer.parseInt(a2);

                int sum=n1+n2;
                t.setText("Sum = "+sum);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String a1= et1.getText().toString();
                String a2 = et2.getText().toString();

                int n1 = Integer.parseInt(a1);
                int n2 = Integer.parseInt(a2);

                int sub=n1-n2;
                t.setText("Sub = "+sub);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String a1= et1.getText().toString();
                String a2 = et2.getText().toString();

                int n1 = Integer.parseInt(a1);
                int n2 = Integer.parseInt(a2);

                int mul=n1*n2;
                t.setText("Mul = "+mul);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String a1= et1.getText().toString();
                String a2 = et2.getText().toString();

                int n1 = Integer.parseInt(a1);
                int n2 = Integer.parseInt(a2);

                int div=n1/n2;
                t.setText("Div = "+div);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                et1.setText("");
                et2.setText("");
                t.setText("");

            }
        });
    }
}