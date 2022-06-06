package com.example.thirdapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showtoast(view: android.view.View) {
        Toast.makeText(this, "this is a button", Toast.LENGTH_SHORT).show()
    }
}