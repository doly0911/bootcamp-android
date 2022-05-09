package com.bootcamp.myapplication

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.widget.Toast
import java.util.*

class MyService: Service() {

    // Binder given to clients
    private val binder = MyServiceBinder()

    // Random number generator
    private val mGenerator = Random()

    inner class MyServiceBinder: Binder(){
        // Return this instance of MyService
        fun getService(): MyService = this@MyService
    }

    override fun onBind(p0: Intent?): IBinder? {
        Toast.makeText(this, "onBind Service", Toast.LENGTH_SHORT).show()
        return binder
    }

    /** method for clients  */
    val randomNumber: Int
        get() = mGenerator.nextInt(100)

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "onCreate Service", Toast.LENGTH_SHORT).show()
    }


    override fun onUnbind(intent: Intent?): Boolean {
        Toast.makeText(this, "onUnbind Service", Toast.LENGTH_SHORT).show()
        return super.onUnbind(intent)

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Service", Toast.LENGTH_SHORT).show()

    }
}