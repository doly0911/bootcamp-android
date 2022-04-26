
class ConventionalCar:Vehicle() {
    var engineProvider:String = ""
        set(value) {
            if (value.isEmpty()){
                println("El fabricante del motor no puede estar vacío")
            } else
                field = value
        }
    var yearEngine:Int = 0
        set(value) {
            field = if (yearEngine>0) {
                value
            } else
                0

        }

    fun refuel(){
        println("LLenando tanque de gasolina...")
    }

    override fun accelerate() {
        println("pisando el embrague y encendiendo...")
    }
}