package com.joshua.joshuarelata2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // BOTON NUEVO RELATO
        val btnRelatoNuevo : TextView = findViewById(R.id.tvIniciarRelato)
        btnRelatoNuevo.setOnClickListener {

            val intent = Intent(this, CrearRelato::class.java)
            startActivity(intent)
        }



        // BOTON LEER RELATO
        val btnLEer : TextView = findViewById(R.id.btnLeerRelatos)
        btnLEer.setOnClickListener {

            val intent = Intent(this, ListaRelatos::class.java)
            startActivity(intent)
        }

        // BOTON BACK
        val btnBack : ImageView = findViewById(R.id.btnBAck)
        btnBack.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // BOTON Seguir relato
        val btnEscribir : TextView = findViewById(R.id.btnContinuarRelato)
        btnEscribir.setOnClickListener {

            val intent = Intent(this, ListaRelatos::class.java)
            startActivity(intent)
        }
        /*
                // BOTON Seguir relato
                val btnEscribir2 : Button = findViewById(R.id.btnRelato2)
                btnEscribir2.setOnClickListener {

                    val intent = Intent(this, EscribirRelato::class.java)
                    startActivity(intent)
                }
           */
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