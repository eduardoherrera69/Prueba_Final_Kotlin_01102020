package com.example.prueba_final_kotlin_01102020.Model.Repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.prueba_final_kotlin_01102020.Model.Remoto.ResultList
import com.example.prueba_final_kotlin_01102020.Model.Remoto.RetrofitRandM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryRaM {
private val service =  RetrofitRandM.getRetrofitClient()

    val mLiveData : MutableLiveData<ResultList> = MutableLiveData()

    //la vieja confiable
    fun getDataFromServer() {
        val call2 = service.getDataFromApi()
        call2.enqueue(object : Callback<List<ResultList>> {
            override fun onResponse(call: Call<List<ResultList>>, response: Response<List<ResultList>>) {
                Log.d("Result",response.body().toString())
                when(response.code()){
                    in 200..299 -> mLiveData.postValue(response.body())
                    in 300..399 -> Log.d("ERROR 300", response.errorBody().toString())
                    in 400..499 -> Log.d("ERROR 400", response.errorBody().toString())

                }
            }

            override fun onFailure(call: Call<List<ResultList>>, t: Throwable) {
                Log.d("Repository", t.message.toString())
            }
        })
    }


}