package com.joshua.joshuarelata2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.joshua.joshuarelata2.R
import com.joshua.joshuarelata2.Relato

class RelatosViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val imgRelato = view.findViewById<ImageView>(R.id.imagenRelato)
    val titulo = view.findViewById<TextView>(R.id.tv_titulo)
    val autores = view.findViewById<TextView>(R.id.tv_autores)

    fun render(relatoModel: Relato) {
        titulo.text = relatoModel.titulo
        autores.text = relatoModel.autores

    }
}
