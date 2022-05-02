package salary

import employee.Employee

class SalaryCalculatorSelector:ISalaryCalculatorSelector {
    override fun selectSalaryCalculator(employee: Employee, workedHours: Int): ISalaryCalculator {
       return if(workedHours > employee.hourPerMonth){
            SalaryWithBonusCalculator()
        } else {
            DefaultSalaryCalculator()
        }
    }
}