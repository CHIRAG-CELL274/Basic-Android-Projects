package com.example.progressdialog

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val prg = ProgressDialog(this)
        prg.setMessage("Please wait for some time chirag")
        prg.setCancelable(false)
        Handler().postDelayed({prg.dismiss()},5000)
        prg.show() */

    }
}