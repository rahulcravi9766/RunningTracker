package com.rahul.runningtracker.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rahul.runningtracker.R
import com.rahul.runningtracker.databinding.FragmentSetUpBinding
import kotlinx.android.synthetic.main.fragment_set_up.*


class SetUpFragment : Fragment() {
    private lateinit var binding : FragmentSetUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSetUpBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

          tvContinue.setOnClickListener {
              findNavController().navigate(R.id.action_setUpFragment_to_runningFragment)
          }
    }
}