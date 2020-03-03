package com.example.lab5

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab5.databinding.EncuestaFragmentBinding




class Encuesta : Fragment() {
    private lateinit var viewModel: EncuestaViewModel
    private lateinit var viewModelR:ResultadoViewModel
    private lateinit var bindingEncuesta: EncuestaFragmentBinding
    private var rate:Int=0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingEncuesta = DataBindingUtil.inflate(inflater, R.layout.encuesta_fragment, container, false)


        viewModel = ViewModelProviders.of(activity!!).get(EncuestaViewModel::class.java)
        viewModelR=ViewModelProviders.of(activity!!).get(ResultadoViewModel::class.java)
        bindingEncuesta.encuestaViewModel=viewModel


        bindingEncuesta.lifecycleOwner=viewLifecycleOwner


        viewModel.makePregunta()
        viewModel.selectPregunta()

        bindingEncuesta.Siguiente.setOnClickListener {

            if(rate>=1){

                viewModelR.endSurvey()
                var rateValue=bindingEncuesta.ratingBar.rating

                viewModelR.rating(rateValue)
                viewModelR.establecerRespuesta(rateValue.toString())

                //navigate to results
                view!!.findNavController().navigate(R.id.action_encuesta_to_resultado)
            }else if(viewModel.preguntasLista.size<=1){
                rate=1
                bindingEncuesta.ratingBar.visibility=View.VISIBLE
                bindingEncuesta.Respuestas.visibility=View.GONE
            }
            viewModelR.establecerRespuesta(bindingEncuesta.Respuestas.text.toString())
            viewModel.selectPregunta()
            bindingEncuesta.Respuestas.setText("")
        }


        return bindingEncuesta.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this).get(EncuestaViewModel::class.java)
    Log.i("EncuestaFragment", "Called ViewModelProviders.of")

}

}
