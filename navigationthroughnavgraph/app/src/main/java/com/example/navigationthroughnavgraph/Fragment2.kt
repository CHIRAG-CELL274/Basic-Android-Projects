package com.example.navigationthroughnavgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_1.view.*
import kotlinx.android.synthetic.main.fragment_2.view.*

class Fragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        view.text2.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment1)
        }

        return view
    }
    }



