package br.com.fate.poolucasmontano.model

import poo.lucasmontano.br.com.fate.poolucasmontano.model.EngineImpl

class EletricEngine: EngineImpl() {
    private var battery = 2

    override fun using() {
        println("Gastando energia...")
        battery--
    }

    override fun autonomy(): Boolean {
        return battery > 0
    }
}