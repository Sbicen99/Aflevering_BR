package com.example.aflevering_br;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button minKnap, minKnap2;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       minKnap2 = findViewById(R.id.minKnap2);
       minKnap = findViewById(R.id.minKnap);


        minKnap2.setOnClickListener(this);
        minKnap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            textView3.setText("Tak for at du trykkede! - tryk også på OK, for at se noget magisk igen :-)");


            }
        });

            textView3 = findViewById(R.id.textView3);

    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);



    }
}

