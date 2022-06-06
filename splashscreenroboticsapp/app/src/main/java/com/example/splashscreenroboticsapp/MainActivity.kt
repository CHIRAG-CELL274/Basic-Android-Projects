package com.example.splashscreenroboticsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
//import  com.tapadoo.alerter.Alerter



class MainActivity : AppCompatActivity() {

    val items = arrayOf("Subjects","DSA","Operating system","Industrial pollution control","CAD CAM")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp =findViewById<Spinner>(R.id.sp)
        val result = findViewById<TextView>(R.id.result)

        sp.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)

        sp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                result.text=items.get(p3.toInt())
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                result.text="Please Select your subject"
            }
        }

        }

    fun show(view: View) {

        /*Alerter.create(this)
            .setTitle("Elective subject")
            .setText("Thank you for selecting")
            .setBackgroundColorRes(R.color.purple_200)
            .enableVibration(true)
            .enableProgress(true)
            .show() */


    }
}


