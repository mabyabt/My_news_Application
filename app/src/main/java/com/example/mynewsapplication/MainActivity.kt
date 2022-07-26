package com.example.mynewsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myview : WebView? = null


        myview = findViewById<View>(R.id.webView) as WebView
        val webSettings: WebSettings = myview.getSettings()
        webSettings.javaScriptEnabled = true
        myview.setWebViewClient(WebViewClient())
        myview.loadUrl("https://mabyabt.bearblog.dev/")

        fun onPause() {
            super.onPause()
            myview.onPause()

    }

        fun onResume() {
            super.onResume()
            myview.onResume()
        }
}}