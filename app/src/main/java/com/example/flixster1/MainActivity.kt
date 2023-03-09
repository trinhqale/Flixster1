package com.example.flixster1

import android.bluetooth.BluetoothStatusCodes
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flixster1.R.id
import android.util.Log
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setTitle("Flixster")
            actionBar.setDisplayShowHomeEnabled(true)
//            actionBar.setLogo(R.drawable.flixster_icon)
            actionBar.setLogo(R.mipmap.ic_launcher)
            actionBar.setDisplayUseLogoEnabled(true)
        }
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#054504")))

        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction =supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, MovieFragment(), null).commit()

    }
}