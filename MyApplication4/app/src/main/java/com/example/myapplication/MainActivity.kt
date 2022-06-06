package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


    }

    fun show(view: View) {

        var na :EditText = findViewById<EditText>(R.id.name)
        var pass :EditText = findViewById<EditText>(R.id.password)
        var nam:String = na.text.toString()
        val pa:Int = pass.text.toString().toInt()

        Toast.makeText(this,"Name:"+nam +" "+"Password"+pa,Toast.LENGTH_SHORT).show()

    }


}