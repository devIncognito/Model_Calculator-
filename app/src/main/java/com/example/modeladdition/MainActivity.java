package com.example.modeladdition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add_btn,subtract_btn,divide_btn,multiply_btn;

    EditText number_1,number_2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_1 =(EditText)findViewById(R.id.number_1);
        number_2 =(EditText)findViewById(R.id.number_2);
        add_btn =(Button)findViewById(R.id.add_btn);
        subtract_btn =(Button)findViewById(R.id.subtract_btn);
        divide_btn =(Button)findViewById(R.id.divide_btn);
        multiply_btn =(Button) findViewById(R.id.multiply_btn);
        result =(TextView)findViewById(R.id.result);

        add_btn.setOnClickListener(this);
        subtract_btn.setOnClickListener(this);
        divide_btn.setOnClickListener(this);
        multiply_btn.setOnClickListener(this);
    }

    public void onClick(View v){

        float value1,value2;
               float value3 = 0;

        value1=Float.parseFloat(number_1.getText().toString());
        value2=Float.parseFloat(number_2.getText().toString());

        if (v.getId()==R.id.add_btn) {

            value3 = value1 + value2;

    }else if (v.getId()==R.id.subtract_btn){

            value3 = value1 - value2;

        }else if (v.getId()==R.id.multiply_btn){

            value3 = value1 * value2;

        }else if (v.getId()==R.id.divide_btn){

            value3 = value1 / value2;

        }

        result.setText(value3+ "");
    }
}
