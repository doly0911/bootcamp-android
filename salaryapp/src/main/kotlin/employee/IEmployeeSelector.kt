package employee

interface IEmployeeSelector {
    fun selectEmployee(role:Int):Employee?
}