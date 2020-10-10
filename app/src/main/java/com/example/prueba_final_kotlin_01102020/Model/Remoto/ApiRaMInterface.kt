package com.example.prueba_final_kotlin_01102020.Model.Remoto

import retrofit2.Call
import retrofit2.http.GET

interface ApiRaMInterface {

@GET("character")
fun getDataFromApi(): Call<List<ResultList>>

}