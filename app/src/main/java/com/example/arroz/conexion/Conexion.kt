package com.example.arroz.conexion

import android.content.Context


import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Conexion (var contexto: Context) :SQLiteOpenHelper(contexto, "arroz",null,1) {


    override fun onCreate(db: SQLiteDatabase?) {

        var tablaArroz = "CREATE TABLE arroz(id Integer not null primary key autoincrement, " +
                " nombre varchar(100), imagen varchar(100) )"


        db?.execSQL(tablaArroz)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}