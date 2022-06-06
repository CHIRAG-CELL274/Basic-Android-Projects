package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
   val ad = edit.text.toString()
        val i= Intent()
        i.action=Intent.ACTION_DIAL
        i.data= Uri.parse("tel:$ad")

        startActivity(i)
    }
}