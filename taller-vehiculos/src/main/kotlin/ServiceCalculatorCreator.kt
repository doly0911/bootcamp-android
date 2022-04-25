class ServiceCalculatorCreator: IServiceCalculatorCreator {
    override fun getServiceCalculator(vehicle: Vehicle, service: ServiceEnum): IServiceCalculator {
        return when(service){
            ServiceEnum.REVIEW ->
                if(vehicle is ConventionalCar){
                    ReviewConventionalCarServiceCalculator()
                }else{
                    ReviewElectricCarServiceCalculator()
                }
            ServiceEnum.PAINTING -> PaintingServiceCalculator()
        }
    }
}
