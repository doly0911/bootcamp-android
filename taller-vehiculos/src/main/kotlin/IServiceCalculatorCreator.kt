interface IServiceCalculatorCreator {
    fun getServiceCalculator(vehicle: Vehicle, service: ServiceEnum): IServiceCalculator
}