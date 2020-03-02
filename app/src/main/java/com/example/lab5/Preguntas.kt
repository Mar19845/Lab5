package com.example.lab5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.lab5.R.layout.fragment_preguntas

/**
 * A simple [Fragment] subclass.
 */
class Preguntas : Fragment() {
    var texto:String=""
    private lateinit var viewModel: EncuestaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bindingPreguntas= DataBindingUtil.inflate<PreguntasFragmentBinding>(inflater,
            fragment_preguntas,container,false)
        //return inflater.inflate(fragment_preguntas, container, false)
        return bindingPreguntas.root

    }


}
