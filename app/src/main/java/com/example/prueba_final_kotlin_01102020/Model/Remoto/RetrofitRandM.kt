package com.example.prueba_final_kotlin_01102020.Model.Remoto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitRandM {


    companion object {

        private const val URL_BASE = "https://rickandmortyapi.com/api/"

fun getRetrofitClient (): ApiRaMInterface {
    val mCRetrofit = Retrofit.Builder().baseUrl(URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    return mCRetrofit.create(ApiRaMInterface::class.java)

}

 }


}