fun main(args: Array<String>) {
    val serviceCalculatorCreator  = ServiceCalculatorCreator()
    val garageInventory : IGarageInventory = GarageInventory(serviceCalculatorCreator)
    var vehicles : Map<Vehicle,Int> = HashMap()

    //instanciamos un Objeto de la clase ConventionalCar
    val conventionalCar = ConventionalCar()
    conventionalCar.color= "blanco";
    conventionalCar.brand= "toyota"
    conventionalCar.engineProvider= "CaterPillar"
    conventionalCar.yearEngine= 2000;
    //conventionalCar.accelerate()

    val conventionalCar2 = ConventionalCar()
    conventionalCar2.color= "rojo";
    conventionalCar2.brand= "ford"
    conventionalCar2.engineProvider= "CaterPillar"
    conventionalCar2.yearEngine= 2010;

    val electricCar = ElectricCar()
    electricCar.color= "azul";
    electricCar.brand= "renault"
    //electricCar.accelerate()

    //Agregamos vehiculos al taller
    vehicles = garageInventory.addVehicleToGarage(conventionalCar, ServiceEnum.PAINTING, vehicles)
    vehicles = garageInventory.addVehicleToGarage(conventionalCar2, ServiceEnum.REVIEW, vehicles)
    vehicles = garageInventory.addVehicleToGarage(electricCar, ServiceEnum.REVIEW, vehicles)

    val conventionalCarWithLowestServiceTime = garageInventory.getConventionalCarWithLowestServiceTime(vehicles)
    println("El carro con menor tiempo de servicio es ${conventionalCarWithLowestServiceTime.brand} " +
            "con color ${conventionalCarWithLowestServiceTime.color}")


}
