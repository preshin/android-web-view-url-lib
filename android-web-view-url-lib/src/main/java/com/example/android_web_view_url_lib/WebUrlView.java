package com.example.android_web_view_url_lib;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

public class WebUrlView extends LinearLayoutCompat {

    private WebView webView;

    public WebUrlView(@NonNull Context context) {
        super(context);
        init();
    }

    public WebUrlView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        webView = new WebView(getContext());
        webView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        addView(webView);
    }

    public void loadUrl(String url) {
        webView.loadUrl(url);
    }

}

