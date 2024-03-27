package br.com.fate.poolucasmontano.main

import br.com.fate.poolucasmontano.model.HybridEngine
import br.com.fate.poolucasmontano.model.Car
import br.com.fate.poolucasmontano.model.EletricEngine
import br.com.fate.poolucasmontano.model.FuelEngine


fun main() {

    val engine = FuelEngine()
    val battery = EletricEngine()
    val hybrid = HybridEngine(engine)

    val toyota = Car(hybrid)
    val fusca = Car(engine)
    val tesla = Car(battery)

    toyota.on()
    toyota.move()

    fusca.on()
    fusca.move()

    tesla.on()
    tesla.move()





}