package salary

import employee.Employee

interface ISalaryCalculatorSelector {
    fun selectSalaryCalculator(employee:Employee, workedHours: Int):ISalaryCalculator
}