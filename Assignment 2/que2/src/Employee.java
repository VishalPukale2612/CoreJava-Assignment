
public class Employee {
	
	String firstName;
	String lastName;
	double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {

		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary>0) {
			this.monthlySalary = monthlySalary;
			}
		else {this.monthlySalary =0;}
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary>0) {
			this.monthlySalary = monthlySalary;
			}
		else {this.monthlySalary =0;}
		
	}
	
	public void salaryRaise() {
		
		this.monthlySalary= monthlySalary * 1.1;
	}
	
	

}
