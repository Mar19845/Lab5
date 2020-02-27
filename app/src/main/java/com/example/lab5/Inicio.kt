package com.example.lab5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController


class Inicio : Fragment() {
        //return inflater.inflate(R.layout.fragment_inicio, container, false)
        private lateinit var binding: FragmentInicioBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_inicio, container, false)
        return binding.root

            binding.AgregarPregunntas.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_inicio_to_preguntas)
            }
            binding.IniciarEncuesta.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_inicio_to_RPreguntas)
            }
    }
}


