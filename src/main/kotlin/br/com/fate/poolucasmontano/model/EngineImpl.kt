package poo.lucasmontano.br.com.fate.poolucasmontano.model

abstract class EngineImpl : Engine {
    private var attached: Boolean = false


    override fun on (){
        attached = true
    }

    override fun off ()  {
        attached = false
    }
    fun status (): Boolean {
        return attached
    }

    abstract fun autonomy (): Boolean


}