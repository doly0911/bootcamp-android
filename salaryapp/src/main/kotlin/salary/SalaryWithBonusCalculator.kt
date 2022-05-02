package salary

import employee.Employee

class SalaryWithBonusCalculator: DefaultSalaryCalculator(), ISalaryCalculator {

    override fun calculateSalary(employee: Employee, workedHours: Int): Float {
        val baseSalary = super.calculateSalary(employee, workedHours)

        return baseSalary + 10*employee.pricePerHour
    }
}