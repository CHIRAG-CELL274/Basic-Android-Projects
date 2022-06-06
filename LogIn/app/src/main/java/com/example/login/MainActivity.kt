package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:MaterialButton=findViewById(R.id.loginbtn)

        button.setOnClickListener {
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
        }
    }
}


