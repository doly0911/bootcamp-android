
class ConventionalCar:Vehicle() {
    var engineProvider:String = ""
    var yearEngine:Int=2000

    override fun stop() {
        println("Frenando carro convencional...")
    }
}