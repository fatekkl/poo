package br.com.fate.poolucasmontano.model

import poo.lucasmontano.br.com.fate.poolucasmontano.model.EngineImpl

class HybridEngine(private val engine: Engine) : EngineImpl() {
    private var fuel: Int = 2
    private var battery: Int = 1

    override fun using() {
        engine.using()
    }

    override fun autonomy(): Boolean {
        return fuel > 0 || battery > 0
    }


}