package br.com.fate.poolucasmontano.model

import poo.lucasmontano.br.com.fate.poolucasmontano.model.EngineImpl

class HybridEngine : EngineImpl() {
    private var fuel: Int = 2
    private var battery: Int = 1

    override fun using() {
        when {
            fuel > battery -> {
                fuel--
                println("Gastando combústivel")
            }
            battery > fuel -> {
                battery--
                println("Gastando bateria...")
            }
            else -> {
                fuel--
                println("Gastando combústivel...")
            }
        }

    }

    override fun autonomy(): Boolean {
        return fuel > 0 || battery > 0
    }


}