package com.example.prueba_final_kotlin_01102020.Model.Local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface RaMDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllPrincipal(mPrincipal: Principal)





}