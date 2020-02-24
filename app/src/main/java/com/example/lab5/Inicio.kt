package com.example.lab5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.lab5.databinding.FragmentInicioBinding

class Inicio : Fragment() {
        //return inflater.inflate(R.layout.fragment_inicio, container, false)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentInicioBinding>(inflater,
            R.layout.fragment_inicio,container,false)
        return binding.root
    }
}


