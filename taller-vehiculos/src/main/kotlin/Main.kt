fun main(args: Array<String>) {
    val serviceCalculatorCreator : IServiceCalculatorCreator = ServiceCalculatorCreator();
    val conventionalCar = ConventionalCar()
    conventionalCar.color= "blanco";
    conventionalCar.brand= "toyota"
    conventionalCar.engineProvider= "CaterPillar"
    conventionalCar.yearEngine= 2000;

    println("--LLEGA UN CARRO CONVENCIONAL--")
    println("color: ${conventionalCar.color}")
    println("marca: ${conventionalCar.brand}")
    println("Fabricante del motor: ${conventionalCar.engineProvider}")
    println("Año fabricación del motor: ${conventionalCar.yearEngine}")

    val electricCar = ElectricCar()
    electricCar.color= "azul";
    electricCar.brand= "toyota"
    printDays(electricCar,ServiceEnum.REVIEW,serviceCalculatorCreator);
    printDays(electricCar,ServiceEnum.PAINTING,serviceCalculatorCreator);
    printDays(conventionalCar,ServiceEnum.PAINTING,serviceCalculatorCreator);
    printDays(conventionalCar,ServiceEnum.REVIEW,serviceCalculatorCreator);

}

fun printDays(v : Vehicle, s : ServiceEnum, creator : IServiceCalculatorCreator){
    val serviceCalculator = creator.getServiceCalculator(v,s);
    println("Se demora ${serviceCalculator.calculate(v)} ")
}