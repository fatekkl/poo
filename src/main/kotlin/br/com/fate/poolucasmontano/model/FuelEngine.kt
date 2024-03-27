package poo.lucasmontano.br.com.fate.poolucasmontano.model

class FuelEngine : EngineImpl() {
    private var fuel: Int = 2

    override fun using() {
        println("Gastando combústivel")
        fuel--
    }
    override fun autonomy(): Boolean {
        return fuel > 0
    }
}
