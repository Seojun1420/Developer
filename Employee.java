public class Employee {
	public String name; //
	public double salary;// 0.0
	public Employee(String name) {
		this.name = name;
		
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void pirntEmp() {
		System.out.println("name: "+this.name);
		System.out.println("salary: "+this.salary);
		
	}

}
