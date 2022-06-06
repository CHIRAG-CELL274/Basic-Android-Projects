package com.example.webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview = findViewById<WebView>(R.id.webview)

        webview.loadUrl("http://www.google.com")
        webview.webViewClient=MyWeb()

    }

    override fun onBackPressed() {
        val webview = findViewById<WebView>(R.id.webview)

        if (webview.canGoBack()){
            webview.goBack()
        }
        else{
            super.onBackPressed()
        }

    }
    class MyWeb:WebViewClient()
    {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

                view?.loadUrl(url.toString())

            return true
        }
    }
    }
