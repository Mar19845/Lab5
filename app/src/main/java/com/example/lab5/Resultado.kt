package com.example.lab5

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab5.databinding.ResultadoFragmentBinding


class Resultado : Fragment() {


    private lateinit var viewModel: ResultadoViewModel
    private lateinit var bindingResultado : ResultadoFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingResultado = DataBindingUtil.inflate(inflater, R.layout.resultado_fragment, container, false)

        viewModel = ViewModelProviders.of(activity!!).get(ResultadoViewModel::class.java)
        var ratings = viewModel.promedioRate.toString()
        var encuestas = viewModel.cantidadEncuestas.toString()

        bindingResultado.Rate.setText("Promedio calificacioness: $ratings")
        bindingResultado.NumEncuestas.setText("Cantidad de encuestas: $encuestas")


        bindingResultado.Nuevo.setOnClickListener {
            view!!.findNavController().navigate(R.id.action_resultado_to_inicio)
        }

            return bindingResultado.root
        }
}
