package com.example.prueba_final_kotlin_01102020.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.prueba_final_kotlin_01102020.Model.Remoto.List
import com.example.prueba_final_kotlin_01102020.Model.Remoto.ResultList


import com.example.prueba_final_kotlin_01102020.Model.Repo.RepositoryRaM

class MyViewModel : ViewModel () {

    private val repository = RepositoryRaM()
    init {
        repository.getDataFromServer()

    }
        fun exposeFromServer(): MutableLiveData<ResultList> {
        return repository.mLiveData

}


}