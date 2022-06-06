package com.example.allappfinalversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    val suggestion = arrayOf("SHRISTI","BULBUL","CHIRAG","RISHI")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val auto = findViewById<AutoCompleteTextView>(R.id.auto)
  //adapter
  // array adapter

  val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,suggestion)
  auto.threshold=0
  auto.setAdapter(adapter)
  auto.setOnFocusChangeListener{
      view,hint-> if(hint)
          auto.showDropDown()
  }

    }
}