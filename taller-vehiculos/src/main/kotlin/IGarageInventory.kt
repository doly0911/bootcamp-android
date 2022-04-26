interface IGarageInventory {
    fun addVehicleToGarage(v: Vehicle, s: ServiceEnum, vehicles: Map<Vehicle, Int>): Map<Vehicle, Int>
    fun getConventionalCarWithLowestServiceTime(vehicles : Map<Vehicle,Int>): Vehicle

}