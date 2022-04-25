

open class Vehicle () {
    val brand: String = ""
    val color: String = ""


    fun accelerate() {
        println("Estoy acelarando...")
    }

    fun moveForward() {
        println("Estoy moviéndome hacia adelante...")
    }

    fun moveBack() {
        println("Estoy moviéndome hacia atrás...")
    }

    open fun stop(){
        println("Estoy frenando...")
    }

}