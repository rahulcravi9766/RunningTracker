package com.rahul.runningtracker.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rahul.runningtracker.databinding.FragmentSetUpBinding


class SetUpFragment : Fragment() {
    private lateinit var binding : FragmentSetUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSetUpBinding.inflate(inflater, container, false)

        return binding.root
    }
}