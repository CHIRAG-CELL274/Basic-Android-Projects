package com.example.triviaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.triviaapp.databinding.FragmentGameLoseBinding

class GameLoseFragment: Fragment(){
override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentGameLoseBinding=
        DataBindingUtil.inflate<FragmentGameLoseBinding>(inflater,R.layout.fragment_game_lose, container, false)
    return binding.root
    }}