package com.example.prueba_final_kotlin_01102020.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prueba_final_kotlin_01102020.R
import com.example.prueba_final_kotlin_01102020.ViewModel.MyAdapter
import com.example.prueba_final_kotlin_01102020.ViewModel.MyViewModel
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    lateinit var mViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(MyViewModel::class.java)


    }

            override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

                // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mRecyclerView = recycler
        val mAdapter = MyAdapter()
        mRecyclerView.adapter = mAdapter
        mRecyclerView.layoutManager = LinearLayoutManager(context)

        mViewModel.exposeFromServer().observe(viewLifecycleOwner, Observer {
            mAdapter.upDateList(it)
        })


        }


}