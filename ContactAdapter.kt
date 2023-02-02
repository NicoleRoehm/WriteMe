package com.example.writeme.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.writeme.R
import com.example.writeme.data.model.ContactName
import com.example.writeme.ui.HomeFragmentDirections


class ContactAdapter(

) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    private var dataset = listOf<ContactName>()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name : TextView = view.findViewById(R.id.home_name_text)
        val image: ImageView = view.findViewById(R.id.home_image)
        val writeText : TextView = view.findViewById(R.id.home_write_text)
    }

    fun submitList (list: List<ContactName>){

        dataset = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contacts: ContactName = dataset[position]

        holder.name.text = contacts.name
        holder.image.setImageResource(contacts.imageResourceId)

        holder.writeText.setOnClickListener{
            holder.itemView.findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment())
        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}



