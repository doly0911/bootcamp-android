
class ReviewElectricCarServiceCalculator: IServiceCalculator {
    override fun calculate(vehicle: Vehicle): Int {
        if(vehicle.brand.equals("Ford", true)){
            return 10
        }
        return 5
    }
}