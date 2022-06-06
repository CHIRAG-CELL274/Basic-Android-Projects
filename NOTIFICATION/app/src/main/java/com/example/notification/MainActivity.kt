package com.example.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View as View1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun show (view : View1)
    {
        Alerter.create(this)
            .setTitle("Elective subject")
            .setText("Thank you for selecting")
            .setBackgroundColorRes(R.color.purple_200)
            .enableVibration(true)
            .enableProgress(true)
            .show()
    }
}