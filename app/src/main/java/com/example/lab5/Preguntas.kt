package com.example.lab5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab5.databinding.FragmentPreguntasBinding

/**
 * A simple [Fragment] subclass.
 */
class Preguntas : Fragment() {
    var texto:String=""
    private lateinit var bindingPreguntas: FragmentPreguntasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingPreguntas = DataBindingUtil.inflate(inflater, R.layout.encuesta_fragment, container, false)

        bindingPreguntas.agregar.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_preguntas_to_inicio)
        }

        return bindingPreguntas.root

    }


}
