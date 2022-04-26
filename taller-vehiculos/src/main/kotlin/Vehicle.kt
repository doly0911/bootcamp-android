open class Vehicle () {
   var brand: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.isEmpty()){
                println("Marca del carro esta vacía")
            } else
                field = value
        }
    var color: String = ""


    open fun accelerate() {
        println("Estoy acelarando...")
    }

    fun moveForward() {
        println("Estoy moviéndome hacia adelante...")
    }

    fun moveBack() {
        println("Estoy moviéndome hacia atrás...")
    }

    fun stop(){
        println("Estoy frenando...")
    }

}