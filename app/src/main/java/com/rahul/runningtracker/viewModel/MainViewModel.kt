package com.rahul.runningtracker.viewModel

import androidx.lifecycle.ViewModel
import com.rahul.runningtracker.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel(){


}