package com.rahul.runningtracker.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rahul.runningtracker.databinding.FragmentStatisticsBinding
import com.rahul.runningtracker.viewModel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment() {
    private lateinit var binding : FragmentStatisticsBinding
    private val viewModel : StatisticsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentStatisticsBinding.inflate(inflater, container, false)

        return binding.root
    }
}