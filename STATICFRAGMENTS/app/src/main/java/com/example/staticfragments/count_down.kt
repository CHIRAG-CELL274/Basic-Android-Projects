package com.example.staticfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.count_down.*
import kotlinx.android.synthetic.main.count_down.view.*



class count_down : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var count=0
        val fragmentView= inflater.inflate(R.layout.count_down, container, false)

      fragmentView. decrease.setOnClickListener {
            count--

        fragmentView.down.text=count.toString()
        }


        return fragmentView


    }
}