package com.example.prueba_final_kotlin_01102020.POJO


import com.google.gson.annotations.SerializedName

data class Principal(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)