package com.example.intent

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun show(view: View) {
 val i = Intent(this,MainActivity2::class.java)
val editresult = edit.text
        i.putExtra("key_1",editresult.toString())

        startActivity(i)
    }
}