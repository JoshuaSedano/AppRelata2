package com.joshua.joshuarelata2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CrearRelato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_relato)

        // BOTON CONTINUAR
        val btnContinuar : Button = findViewById(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, CrearRelatoPjs::class.java)
            startActivity(intent)
        }

        // BOTON BACK
        val btnBack : ImageView = findViewById(R.id.btnBAck)
        btnBack.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
    // Menu desplegable

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_desplegable, menu)
        return true
    }

    // Manejar las opciones del menú seleccionadas (opcional)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.i_home -> {
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
                return true
            }
            R.id.i_crear -> {
                val intentCrear = Intent(this, CrearRelato::class.java)
                startActivity(intentCrear)
                return true
            }
            R.id.i_leer -> {
                val intentLeer = Intent(this, LeerRelatos::class.java)
                startActivity(intentLeer)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}