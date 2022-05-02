import employee.Employee
import employee.EmployeeSelector
import employee.IEmployeeSelector
import salary.ISalaryCalculatorSelector
import salary.SalaryCalculatorSelector

fun main(args: Array<String>) {
    val role:Int= 2
    val workedHours: Int= 180

    val employeeSelector: IEmployeeSelector = EmployeeSelector()
    val employee = employeeSelector.selectEmployee(role)

    val salarySelector: ISalaryCalculatorSelector = SalaryCalculatorSelector()
    val salaryCalculator = salarySelector.selectSalaryCalculator(employee, workedHours)

    println("The salary ${employee.javaClass.name} is ${salaryCalculator.calculateSalary(employee, workedHours)} ")
}