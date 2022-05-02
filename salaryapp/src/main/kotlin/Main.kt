import employee.EmployeeSelector
import employee.IEmployeeSelector
import salary.ISalaryCalculatorSelector
import salary.SalaryCalculatorSelector
import java.text.NumberFormat
import java.util.Scanner

fun main(args: Array<String>) {

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a role: ")
    // nextInt() reads the next integer from the keyboard
    var role:Int = reader.nextInt()

    print("Enter worked hours: ")
    var workedHours:Int = reader.nextInt()

    val employeeSelector: IEmployeeSelector = EmployeeSelector()
    val employee = employeeSelector.selectEmployee(role)

    val salarySelector: ISalaryCalculatorSelector = SalaryCalculatorSelector()
    val salaryCalculator = salarySelector.selectSalaryCalculator(employee, workedHours)
    val numHours = NumberFormat.getInstance().format(salaryCalculator.calculateSalary(employee, workedHours));

    println("The salary ${employee.javaClass.name} is $numHours")
}