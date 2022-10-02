package com.example.grcboard_lapak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        supportActionBar?.hide()

        val handler =  Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent (this,ViewPagerActivity::class.java)
            startActivity(intent)
            finish()
        },1000)

        setFullScreen(window)
        lightStatusBar(window)
    }
}