package com.example.abouttwohawasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 : Button = findViewById(R.id.hawasi1)
        val button2 : Button =findViewById(R.id.hawasi2)

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container,BlankFragment1()).commit()
        }

        button2.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.container,BlankFragment2()).commit()
        }
    }
}