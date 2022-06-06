package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_fruit.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     /* lvFruits.adapter=ArrayAdapter<String>(this,R.layout.list_item_fruit,R.id.item, arrayOf("MANGO","APPLE","JACKFRUIT","PAPAYA"))

        lvFruits.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "CHIRAG ate $i ${view.item.text}", Toast.LENGTH_SHORT).show()
        }*/

val fruits = Fruits.ge.getrandomfruits(100)


    }
}

