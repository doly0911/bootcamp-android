class GarageInventory(serviceCalculatorCreator: IServiceCalculatorCreator): IGarageInventory {

    private val serviceCalculatorCreator : IServiceCalculatorCreator

    init{
        this.serviceCalculatorCreator = serviceCalculatorCreator
    }

    override fun addVehicleToGarage(v: Vehicle, s: ServiceEnum, vehicles: Map<Vehicle, Int>): Map<Vehicle, Int> {
        val serviceCalculator = serviceCalculatorCreator.getServiceCalculator(v, s)
        val days: Int = serviceCalculator.calculate(v)
        println("El vehiculo ${v.brand} se demora ${days} dias en el taller")
        return vehicles.plus(Pair(v,days))
    }

    override fun getConventionalCarWithLowestServiceTime(vehicles: Map<Vehicle, Int>): Vehicle {
       return vehicles.filter { v -> v.key is ConventionalCar }
           .toList().minByOrNull { (_, value) -> value }!!.first
    }
}