package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        var checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        var button = findViewById<Button>(R.id.button)
    }

    fun show(view: View) {
        var checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        var checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        if (checkbox1.isChecked)
        {
            Toast.makeText(this,"You are male",Toast.LENGTH_SHORT).show()
        }
        if (checkbox2.isChecked)
        {
            Toast.makeText(this,"You are female",Toast.LENGTH_SHORT).show()
        }
    }
}