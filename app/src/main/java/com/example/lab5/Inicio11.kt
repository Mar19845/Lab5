package com.example.lab5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab5.databinding.FragmentInicioBinding


class Inicio11 : Fragment() {
    private lateinit var binding: FragmentInicioBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_inicio, container, false)

        //binding = DataBindingUtil.inflate(inflater, R.layout.fragment_inicio, container, false)
        //val binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_inicio, viewGroup, false)
        //return inflater.inflate(R.layout.fragment_inicio, container, false)


        binding.AgregarPreguntas.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_inicio_to_preguntas)
        }
        //binding.IniciarEncuesta.setOnClickListener{view : View ->
        //view.findNavController().navigate(R.id.action_inicio_to_encuesta)}

        return binding.root
    }
}