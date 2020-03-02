package com.example.lab5

import androidx.lifecycle.ViewModel

class ResultadoViewModel : ViewModel() {
    var cantidadEncuestas:Int=0
    var promedioRate:Float=0.0f
    private var respuestas=ArrayList<String>()


    fun endSurvey(){
        cantidadEncuestas++
    }
    fun rating(ratingbar:Float){
        promedioRate=(promedioRate+ratingbar)/cantidadEncuestas
    }

    fun returnAll():ArrayList<String>{
        return respuestas
    }

    fun establecerRespuesta(respuesta:String){
        respuestas.add(respuesta)
    }
}
