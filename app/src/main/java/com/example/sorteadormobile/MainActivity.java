package com.example.sorteadormobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.sorteadormobile.R;

public class MainActivity extends Activity {

    TextView tv;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.txt);
        input = (EditText) findViewById(R.id.input);

    }

    public void sortear(View v){

        try{

            Double x = Double.parseDouble(input.getText().toString());

            Integer y = (Integer)((int)(Math.ceil(Math.random()*x)));

            if(x > 2147483646 || x < -2147483647){

                tv.setText("Número limite não permitido");

            }else{

                tv.setText(y.toString());

            }

        }catch(Exception e){

            tv.setText("Tente novamente");

        }

    }

}
