
class PaintingServiceCalculator: IServiceCalculator {
    private val primaryColors = arrayOf("verde", "azul", "rojo")

    override fun calculate(vehicle: Vehicle): Int {
        val isPrimaryColorContained = vehicle.color in primaryColors
        return if (isPrimaryColorContained){
            2
        } else {
            4
        }
    }
}