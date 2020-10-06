package com.example.prueba_final_kotlin_01102020

import android.telecom.Call
import com.example.prueba_final_kotlin_01102020.POJO.Principal
import retrofit2.http.GET

interface ApiRaMInterface {

@GET("character")
fun getDataFromApi(): retrofit2.Call<Principal>

}