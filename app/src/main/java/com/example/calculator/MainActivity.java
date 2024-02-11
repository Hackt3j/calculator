package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, btnadd,btnsub, btnmultiply, btndiv, btndot, btnclear, btnequal, btnbackspace, btnpercent,btn00;
    TextView tv;

    Float n1,n2,ans;
    String op="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.textview);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndiv=findViewById(R.id.btndiv);
        btndot=findViewById(R.id.btndot);
        btnequal=findViewById(R.id.btnequal);
        btnclear=findViewById(R.id.btnclear);
        btnbackspace=findViewById(R.id.btnbackspace);
        btnpercent=findViewById(R.id.btnpercent);
        btn00=findViewById(R.id.btn00);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"9");

            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"0");
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"00");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(tv.getText()+"");
                op="+";
                tv.setText(null);

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(tv.getText()+"");
                op="-";
                tv.setText(null);

            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(tv.getText()+"");
                op="*";
                tv.setText(null);

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(tv.getText()+"");
                op="/";
                tv.setText(null);

            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2=Float.parseFloat(tv.getText()+"");
                switch (op){
                    case "+" : ans=n1+n2;
                       break;
                    case "-" : ans=n1-n2;
                        break;
                    case "*" : ans=n1*n2;
                        break;
                    case "/" :
                        if (n2 != 0) {
                            ans=n1/n2;
                        } else {


                        }
                        break;

                }
                tv.setText(ans+"");

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(null);

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+".");

            }
        });

        btnbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv.getText().toString().equals("")){
                    String val = tv.getText().toString();

                    if (val.length()>0){
                        val = val.substring(0,val.length()-1);
                        tv.setText(val);
                    }
                }
            }

         });

        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"%");

            }
        });











    }
}