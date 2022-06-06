package com.example.splashscreenroboticsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import java.util.*


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val screen = object : Thread ()
        {
            override fun run() {
                try {


                    Thread.sleep(3000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e:Exception){
                    e.printStackTrace()
                }
            }

        }
        screen.start()
    }
}