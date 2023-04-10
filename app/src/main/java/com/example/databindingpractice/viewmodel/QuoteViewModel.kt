package com.example.databindingpractice.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {
    val _quoteLiveData = MutableLiveData<String>()

    fun updateQuoteValue() {
        _quoteLiveData.postValue("This is the latest value of the quote")
    }
}
