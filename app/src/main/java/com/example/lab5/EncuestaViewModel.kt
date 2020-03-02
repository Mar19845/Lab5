package com.example.lab5

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EncuestaViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var encuesta= MutableLiveData<String>()

    val pregunta: LiveData<String>
        get() = encuesta
    lateinit var preguntasLista:MutableList<String>
    var preguntaEcha:String?=null

    init {
        Log.i("EncuestaViewModel", "EncuestaViewModel created!")
    }

    fun makePregunta(){
        if (preguntaEcha.isNullOrEmpty()) {
            preguntasLista = mutableListOf(
                "Cual es tu opinion",
                "Calificanos"
            )

        }else{
            preguntasLista= mutableListOf(
                preguntaEcha.toString()
            )

            preguntasLista.add("Cual es tu opinion")
            preguntasLista.add("Calificanos")
        }


    }
    fun selectPregunta() {
        if (preguntasLista.isNotEmpty()){
            encuesta.value=preguntasLista.removeAt(0)
            Log.i("EncuestaView: ","Removido")
        }

    }

    fun addPregunta(pregunta:String){
        preguntaEcha=pregunta
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("EncuestaViewModel", "Encuesta destroyed!")
    }


}
