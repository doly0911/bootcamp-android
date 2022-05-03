package employee

class EmployeeSelector:IEmployeeSelector {
    override fun selectEmployee(role: Int): Employee? {
        return try {
            when(Role.values()[role-1]){
                Role.MANAGER -> Manager()
                Role.OPERATOR -> Operator()
                Role.ACCOUNTANT -> Accountant()
            }
        } catch ( e: ArrayIndexOutOfBoundsException){
            null
        }
    }
}