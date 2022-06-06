package com.example.staticfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.count_up.*
import kotlinx.android.synthetic.main.count_up.view.*


class count_up : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var count = 0
        val fragmentView = inflater.inflate(R.layout.count_up, container, false)

       fragmentView. increase.setOnClickListener{
            count++

            fragmentView.up.text= count.toString()
        }

        return fragmentView



    }
}
