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

    private val _chatMessage = MutableLiveData<MutableList<String>>()
    val chatMessage: LiveData<MutableList<String>>
    get() = _chatMessage

    fun loadChat(id:Int){
        val chats = _contacts.value?.find{ it.id == id}
        if (chats != null){
            _chatMessage.value = chats.historyChat
        }
    }

    fun addChat(message:String){

        _chatMessage.value?.add(0,message)
        _chatMessage.value = _chatMessage.value
    }

    init {
        _contacts.value = repository.loadContact()
    }
}