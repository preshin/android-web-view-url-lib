package com.example.webviewapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_web_view_url_lib.WebUrlView;

public class MainActivity extends AppCompatActivity {

    private Button openWebViewButton;
    private WebUrlView webUrlView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openWebViewButton = findViewById(R.id.openWebViewButton);
        webUrlView = findViewById(R.id.webUrlView);

        openWebViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebViewButton.setVisibility(View.GONE);
                webUrlView.setVisibility(View.VISIBLE);
                String url = "https://chatbot-r3.deepconverse.com/?draft=true&hostname=dcstg23-calendly.deepconverse.com";
                webUrlView.loadUrl(url);
            }
        });

//        webUrlView.setWebViewCloseListener(new WebUrlView.WebViewCloseListener() {
//            @Override
//            public void onWebViewClose() {
//                openWebViewButton.setVisibility(View.VISIBLE);
//                webUrlView.setVisibility(View.GONE);
//            }
//        });
    }
}
