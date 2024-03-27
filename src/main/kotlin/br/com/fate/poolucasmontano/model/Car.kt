package br.com.fate.poolucasmontano.model

import poo.lucasmontano.br.com.fate.poolucasmontano.model.EngineImpl

class Car (private val engine: EngineImpl) : Engine by engine{

    fun move() {
        when {
            !engine.status() ->  println("liga o carro né bobao")
            !engine.autonomy()  -> when (engine) {
                is EletricEngine -> println("carrega o carro né")
                is FuelEngine -> println("coloca combústivel né")
                is HybridEngine -> println("coloca combústivel ou carrega né")
            }
            else -> {
                engine.using()
                when (engine) {
                    is EletricEngine -> println("Moving...")
                    is FuelEngine -> println("vrumvrum")
                    is HybridEngine -> println("zumzum")

                }
            }
        }

    }

}