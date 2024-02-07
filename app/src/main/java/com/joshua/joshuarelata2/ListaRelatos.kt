package com.joshua.joshuarelata2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.joshua.joshuarelata2.adapter.RelatosAdapter

class ListaRelatos : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_relatos)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.rv_ListaRelatos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RelatosAdapter(RelatosProvider.listaRelatos)
    }
}