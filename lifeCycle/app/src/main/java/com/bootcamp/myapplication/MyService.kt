package com.bootcamp.myapplication

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.widget.Toast
import java.util.*
import android.media.MediaPlayer




class MyService: Service() {

    // Binder given to clients
    private val binder = MyServiceBinder()

    private lateinit var myPlayer:MediaPlayer

    inner class MyServiceBinder: Binder(){
        // Return this instance of MyService
        fun getService(): MyService = this@MyService
    }

    override fun onBind(p0: Intent?): IBinder? {
        Toast.makeText(this, "onBind Service", Toast.LENGTH_SHORT).show()
        return binder
    }

    /** method for clients  */
    fun playAudio(){
        myPlayer.start()
    }

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "onCreate Service", Toast.LENGTH_SHORT).show()
        myPlayer = MediaPlayer.create(this, R.raw.rington_super_mario_bros)
        myPlayer.setOnCompletionListener { it.release() }
        myPlayer.isLooping = false // Set looping
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)
        Toast.makeText(this, "onRebind Service", Toast.LENGTH_SHORT).show()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Toast.makeText(this, "onUnbind Service", Toast.LENGTH_SHORT).show()
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Service", Toast.LENGTH_SHORT).show()
        myPlayer.stop();
    }
}