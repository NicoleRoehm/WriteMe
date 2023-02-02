package com.example.writeme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.writeme.data.Repository
import com.example.writeme.data.model.ContactName

class MainViewModel : ViewModel() {

    private val repository = Repository()

    private val _contacts = MutableLiveData<List<ContactName>>()
    val contacts : LiveData<List<ContactName>>
    get() = _contacts

    init {
        _contacts.value = repository.loadContact()
    }
}