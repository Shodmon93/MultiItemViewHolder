package com.example.multiitemviewholder

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ListAdapterRV : ListAdapter<User,ListAdapterRV.ViewHolder>(ItemDiff()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

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