package com.joshua.joshuarelata2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joshua.joshuarelata2.R
import com.joshua.joshuarelata2.Relato

class RelatosAdapter(private val listaRelatos: List<Relato>) : RecyclerView.Adapter<RelatosViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RelatosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RelatosViewHolder(layoutInflater.inflate(R.layout.item_relato, parent, false))
    }

    override fun getItemCount(): Int = listaRelatos.size

    override fun onBindViewHolder(holder: RelatosViewHolder, position: Int) {
        val item = listaRelatos[position]
        holder.render(item)
    }
}