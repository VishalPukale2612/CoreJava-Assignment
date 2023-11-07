
public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Ravindra","Shende", 50000);
		Employee e2 = new Employee("Pritam","Shejul", 55000);

		System.out.println(e1.getFirstName() +"'s monthly salary :- "+e1.getMonthlySalary());
		System.out.println(e2.getFirstName() +"'s monthly salary :- "+e2.getMonthlySalary());
		
		e1.salaryRaise();
		e2.salaryRaise();
		
		System.out.println("After salary Hike");

		System.out.println(e1.getFirstName() +"'s monthly salary :- "+e1.getMonthlySalary());
		System.out.println(e2.getFirstName() +"'s monthly salary :- "+e2.getMonthlySalary());
	}

}
