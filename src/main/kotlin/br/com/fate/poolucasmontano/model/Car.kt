package poo.lucasmontano.br.com.fate.poolucasmontano.model

import br.com.fate.poolucasmontano.model.HybridEngine

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