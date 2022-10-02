package com.muthu.livedataviewmodeltest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(number: Int) : ViewModel() {
    private val count = MutableLiveData<Int>()

    val countValue: LiveData<Int> get() = count

    init {
        this.count.value = 0
    }

    fun updateCount() {
        this.count.value = (count.value)?.plus(1)
    }
}