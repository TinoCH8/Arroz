package com.example.arroz.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.arroz.R
import com.example.arroz.models.Arroz

class AdapterArroz (val arroz:ArrayList<Arroz>):RecyclerView.Adapter<AdapterArroz.ViewHolder>(){
    var position=-1


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterArroz.ViewHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.item_arroz, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterArroz.ViewHolder, position: Int) {
        this.position = position
        holder.bindItems(arroz[position])
    }

    override fun getItemCount(): Int {
        return arroz.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        init {

        }
        fun bindItems(arroz: Arroz){
            val txtArroz = itemView.findViewById<TextView>(R.id.item_arroz)
            txtArroz.text=arroz.name
        }

    }

}