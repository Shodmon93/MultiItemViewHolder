package com.example.multiitemviewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ListAdapterRV : ListAdapter<User,ListAdapterRV.ViewHolder>(ItemDiff()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context ).inflate(R.layout.list_view_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val name = itemView.findViewById<TextView>(R.id.name_TXT)

        fun bind(user: User){
           name.text = user.name
        }


    }

}

class ItemDiff() : DiffUtil.ItemCallback<User>(){
    override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
        TODO("Not yet implemented")
    }

}