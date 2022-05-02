package employee

class EmployeeSelector:IEmployeeSelector {
    override fun selectEmployee(role: Int): Employee {
        return when(role){
            1 -> Manager()
            2 -> Operator()
            3 -> Accountant()
            else -> throw error("Invalid role")
        }
    }
}