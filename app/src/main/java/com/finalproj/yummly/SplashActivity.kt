package com.finalproj.yummly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed( {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }
        , SPLASH_TIME)

    }
    //Copyrights © https://github.com/kurut0dev
}
