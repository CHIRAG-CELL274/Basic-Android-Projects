package com.example.dynamicfragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.dynamicfragments.R.layout.fragment__vegetables3
import kotlinx.android.synthetic.main.fragment__vegetables3.*
import kotlinx.android.synthetic.main.fragment__vegetables3.view.*


class Fragment_Vegetables : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fruits = arrayOf("carrot","tomato","potato")

        val fragmentVegetables = inflater.inflate(fragment__vegetables3, container, false)

    fragmentVegetables.vegetables1.adapter = ArrayAdapter<String>(this, R.layout.vegetables,R.id.sun
        fruits)


        return fragmentVegetables
    }




}





