package com.example.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val bu:Button = findViewById<Button>(R.id.button)

        bu.setOnClickListener()
        {
            count++
            click()
        }


    }

    private fun click() {
        val au: TextView= findViewById<TextView>(R.id.text)
        au.setText(count.toString())

    }
}