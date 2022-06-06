package com.example.contextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val result = findViewById<Button>(R.id.result)

        registerForContextMenu(result)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.call -> {
                Toast.makeText(applicationContext, "CALL SELECTED", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.sms -> {
                Toast.makeText(applicationContext, "SMS SELECTED", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.email -> {
                Toast.makeText(applicationContext, "EMAIL SELECTED", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.fax -> {
                Toast.makeText(applicationContext, "FAX SELECTED", Toast.LENGTH_SHORT).show()
                return true
            }
        }




        return super.onContextItemSelected(item)
    }}

