package salary

import employee.Employee

class SalaryWithBonusCalculator: DefaultSalaryCalculator(), ISalaryCalculator {

    override fun calculateSalary(employee: Employee, workedHours: Int): Float {
        val baseSalary = super.calculateSalary(employee, employee.hourPerMonth)
        val bonus = 10*employee.pricePerHour

        return baseSalary + bonus
    }
}