package practice6;
class Employee {
    protected int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    protected void showSalary() {
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    
    public Manager(int salary) {
        super(salary); // Calls the Employee constructor
    }

    public void displayManagerInfo() {
        // NO ERROR: We can access the protected variable directly 
        // because Manager is a subclass of Employee.
        System.out.println("Manager Salary accessed directly: " + this.salary); 
        
        // NO ERROR: We can also access the protected method
        this.showSalary(); 
    }
}
public class Main3 {

	public static void main(String[] args) {
		Manager mgr = new Manager(85000);
        
        System.out.println("=== Manager Details ===");
        mgr.displayManagerInfo();

	}

}
