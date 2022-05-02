package salary

import employee.Employee

open class DefaultSalaryCalculator:ISalaryCalculator {
    override fun calculateSalary(employee: Employee, workedHours: Int): Float {
        return workedHours*employee.pricePerHour
    }
}