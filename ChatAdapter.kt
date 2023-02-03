package com.example.writeme.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.writeme.R
import com.example.writeme.data.model.ContactName


class ChatAdapter (): RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    private var dataset = listOf<String>()

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val chatText = view.findViewById<TextView>(R.id.message_text)
    }

    fun submitList(list: List<String>){
        dataset = list
        notifyItemInserted(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.write_item, parent, false)

        return ViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chats = dataset[position]

        holder.chatText.text = chats

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}