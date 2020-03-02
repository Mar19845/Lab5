package com.example.lab5

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.resultado_fragment.view.*


class Resultado : Fragment() {


    private lateinit var viewModel: ResultadoViewModel
    private lateinit var bindinResultado:ResultadoFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindinResultado = DataBindingUtil.inflate<ResultadoFragmentBinding>(
            inflater,
            R.layout.resultado_fragment,
            container,
            false
        )

        viewModel = ViewModelProviders.of(activity!!).get(ResultadoViewModel::class.java)
        var ratings = viewModel.promedioRate.toString()
        var encuestas = viewModel.cantidadEncuestas.toString()

        bindinResultado.Rate.setText("Promedio calificacioness: $ratings")
        bindinResultado.NumEncuestas.setText("Cantidad de encuestas: $encuestas")


        bindinResultado.Nuevo.setOnClickListener {
            view!!.findNavController().navigate(R.id.action_resultado_to_inicio)
        }

            return bindinResultado.root
        }
}
