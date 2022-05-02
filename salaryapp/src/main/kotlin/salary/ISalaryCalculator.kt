package salary

import employee.Employee

interface ISalaryCalculator {
    fun calculateSalary(employee: Employee, workedHours: Int):Float
}