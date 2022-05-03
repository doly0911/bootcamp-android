import employee.EmployeeSelector
import employee.IEmployeeSelector
import salary.ISalaryCalculatorSelector
import salary.SalaryCalculatorSelector
import java.text.NumberFormat
import java.util.Scanner

fun main(args: Array<String>) {

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("1->Manager, 2->Operator, 3->Accountant \n Enter a role: ")
    // nextInt() reads the next integer from the keyboard
    val role:Int = reader.nextInt()
    val employeeSelector: IEmployeeSelector = EmployeeSelector()
    val employee = employeeSelector.selectEmployee(role)
    employee?.let {
        print(" Enter worked hours: ")
        val workedHours:Int = reader.nextInt()

        val salarySelector: ISalaryCalculatorSelector = SalaryCalculatorSelector()
        val salaryCalculator = salarySelector.selectSalaryCalculator(employee, workedHours)
        val salary = NumberFormat.getInstance().format(salaryCalculator.calculateSalary(employee, workedHours))
        println(" The salary total is $$salary ")
    }
}