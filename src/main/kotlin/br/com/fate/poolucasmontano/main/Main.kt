package poo.lucasmontano.br.com.fate.poolucasmontano.main

import br.com.fate.poolucasmontano.model.HybridEngine
import poo.lucasmontano.br.com.fate.poolucasmontano.model.Car
import poo.lucasmontano.br.com.fate.poolucasmontano.model.EletricEngine
import poo.lucasmontano.br.com.fate.poolucasmontano.model.FuelEngine


fun main() {

    val engine = FuelEngine()
    val battery = EletricEngine()
    val hybrid = HybridEngine()
    
    val toyota = Car(hybrid)

    toyota.on()
    toyota.move()



}