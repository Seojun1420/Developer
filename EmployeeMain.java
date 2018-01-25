
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee("jjdev");//new 객체를 만들고 이안에 name과 salary를 만들어 넣는다
		emp.setSalary(100.0);//this.salary -> emp.salary 가리킨다.
		emp.pirntEmp();//this에 Emp를 출력
		
		Employee emp2 = new Employee("guest");
		emp2.setSalary(50.0);//this.salary -> emp.salary
		emp2.pirntEmp();

	}

}
