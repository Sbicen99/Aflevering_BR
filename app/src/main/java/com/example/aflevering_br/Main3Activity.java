package com.example.aflevering_br;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Main3Activity extends AppCompatActivity {

private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        webView = findViewById(R.id.wb2);
        webView.loadUrl("https://docs.google.com/document/d/1JmHOc2CXTRy9ru1SUzXFomfzV3ORWZdDa2ToAsVZO58/edit");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());


    }
}

