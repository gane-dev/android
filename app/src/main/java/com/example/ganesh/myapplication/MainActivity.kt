package com.example.ganesh.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.util.Log
class MainActivity : Activity() {
    val msg1 = "Android :"
    /*called when the activity is first created */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(msg1,"The onCreate() event")
    }

    override fun onResume() {
        super.onResume()
        Log.d(msg1,"The onResume() event")
    }

    override fun onStop() {
        super.onStop()
        Log.d(msg1,"The onStop() event")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(msg1,"The onDestroy() event")
    }
}
