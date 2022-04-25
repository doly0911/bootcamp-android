class ReviewConventionalCarServiceCalculator : IServiceCalculator {
    override fun calculate(vehicle: Vehicle): Int {
        if (vehicle is ConventionalCar) {
            if (vehicle.yearEngine < 2005) {
                return 10
            }
            if (vehicle.engineProvider == "caterpillar") {
                return 12
            }
            return 8
        }
        return -1
    }
}