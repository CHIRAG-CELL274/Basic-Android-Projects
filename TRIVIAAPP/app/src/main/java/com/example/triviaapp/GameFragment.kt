package com.example.triviaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.triviaapp.databinding.FragmentGameBinding


class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val binding:FragmentGameBinding=
           DataBindingUtil.inflate<FragmentGameBinding>(inflater,R.layout.fragment_game, container, false)

        binding.gamewon.setOnClickListener{
            view:View-> Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_gameWonFragment4)
        }
        binding.gameloose.setOnClickListener{
                view:View-> Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_gameLoseFragment)
        }


        return binding.root
    }}

