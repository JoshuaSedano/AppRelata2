package com.joshua.joshuarelata2

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BaseDatosAPP(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int
) : SQLiteOpenHelper(context, name, factory, version) {


    val TABLE_NAME = "Usuarios"

    val create_users_table = "CREATE TABLE Usuarios"+
            "(ID INT PRIMARY KEY," +
            "NOMBRE TEXT," +
            "PASSWORD TEXT)"

    override fun onCreate(database: SQLiteDatabase?) {

        val insert_data_table_users= "INSERT INTO Usuarios (ID, NOMBRE, PASSWORD) VALUES (1, 'admin', 'admin')"

        database?.execSQL(create_users_table)

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}