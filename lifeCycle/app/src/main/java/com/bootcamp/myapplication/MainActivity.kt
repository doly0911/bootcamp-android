package com.bootcamp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Log.i("Main Activity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Main Activity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Main Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Main Activity", "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Main Activity", "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Main Activity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Main Activity", "onDestroy")
    }

}