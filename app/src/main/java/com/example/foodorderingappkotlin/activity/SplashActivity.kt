package com.example.foodorderingappkotlin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.foodorderingappkotlin.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lottie1.setAnimation("menu.json")
        lottie1.playAnimation()
        lottie1.loop(true)

        Handler(Looper.getMainLooper()).postDelayed({
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 3000)
    }
}