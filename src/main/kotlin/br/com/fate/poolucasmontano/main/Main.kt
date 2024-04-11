package br.com.fate.poolucasmontano.main

import br.com.fate.poolucasmontano.model.Car
import br.com.fate.poolucasmontano.model.EletricEngine
import br.com.fate.poolucasmontano.model.FuelEngineImpl


fun main() {

    val engine = FuelEngineImpl()
    val battery = EletricEngine()

    val fusca = Car(engine)
    val tesla = Car(battery)

    fusca.on()
    fusca.move()

    tesla.on()
    tesla.move()

//implementar dependencia para EngineImpl, assim a propria engine decide o que usar, seja alcool gasolina ou bateria





}