package com.example.writeme.data.model


data class ContactName (
    val id: Int,
    val name: String,
    val imageResourceId : Int,
    val historyChat: MutableList<String>
        )
