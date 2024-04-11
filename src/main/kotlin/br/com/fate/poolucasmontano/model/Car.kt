package br.com.fate.poolucasmontano.model

class Car (
    private val engine: EngineImpl) : Engine by engine
{

    fun move() {
//        when {
//            !engine.status() ->  println("liga o carro né bobao")
//            !engine.autonomy()  -> when (engine) {
//                is EletricEngine -> println("carrega o carro né")
//                is FuelEngineImpl -> println("coloca combústivel né")
//
//            }
//            else -> {
//                engine.using()
//                when (engine) {
//                    is EletricEngine -> println("Moving...")
//                    is FuelEngineImpl -> println("vrumvrum")
//
//                }
//            }
//        }

    }


}