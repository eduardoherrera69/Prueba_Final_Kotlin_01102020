package com.example.prueba_final_kotlin_01102020.ViewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.prueba_final_kotlin_01102020.Model.Remoto.List
import com.example.prueba_final_kotlin_01102020.Model.Remoto.ResultList

<ResultList>
import com.example.prueba_final_kotlin_01102020.R
import kotlinx.android.synthetic.main.characterram.view.*

class MyAdapter: RecyclerView.Adapter<MyAdapter.mViewHolder>() {

    private var mDataList = emptyList<List<ResultList>()

    fun upDateList (mList: List<ResultList>){
        mDataList = listOf(mList)

notifyDataSetChanged()
    }

    inner class  mViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val mMono = itemView.mono
        val mnombremono = itemView.nombremono
        val itemView = itemView.setOnClickListener(this)

        override fun onClick(v: View?) {
            //Not yet implemented
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.characterram, parent,false)
        return mViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: mViewHolder, position: Int) {
        val mResultList : List<ResultList> = mDataList[position]
        holder.mnombremono.text= mResultList[position].name
        Glide.with(holder.itemView.context).load(mResultList[position].image).into(holder.mMono)

    }

    override fun getItemCount(): List<ResultList> = mDataList



}