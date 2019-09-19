package com.example.aflevering_br;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {

private Button minKnap3;
private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView = findViewById(R.id.wb);
        webView.loadUrl("https://javabog.dk/");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());


       minKnap3 = findViewById(R.id.minKnap3);
       minKnap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

    }

    public void openActivity3(){

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }
}



