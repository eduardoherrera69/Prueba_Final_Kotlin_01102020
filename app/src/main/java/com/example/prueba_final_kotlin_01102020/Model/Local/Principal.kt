package com.example.prueba_final_kotlin_01102020.Model.Local


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.prueba_final_kotlin_01102020.Model.Remoto.Info
import com.example.prueba_final_kotlin_01102020.Model.Remoto.Result
import com.google.gson.annotations.SerializedName

@Entity(tableName = "principal_table")
data class Principal(

    @PrimaryKey
    val info: String,
    val results: List<Result>,
    val id: Int,
)