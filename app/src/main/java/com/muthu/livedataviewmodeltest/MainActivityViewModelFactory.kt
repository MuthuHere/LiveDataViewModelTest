package com.muthu.livedataviewmodeltest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val num: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return  MainActivityViewModel(this.num) as T
        }

        throw IllegalArgumentException("unable to find view model")
    }
}