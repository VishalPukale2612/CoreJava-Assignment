package com.sunbeam;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.management.Query;

class Employee implements Comparable<Employee>
{ 
	int id;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

@Override
public int compareTo(Employee other) {
	// TODO Auto-generated method stub
	int diff=Integer.compare(this.id, other.id);
	return diff;
	
}


}

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class EmployeeSalDescComparator implements Comparator<Employee>{

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				int diff= Double.compare(e1.getSalary(), e2.getSalary());
				return -diff;
			}
			
		}
		
		
		Queue<Employee>q=new PriorityQueue<Employee>(new EmployeeSalDescComparator());
		q.offer(new Employee(5,"B",25000));
		q.offer(new Employee(2,"F",55000));
		q.offer(new Employee(3,"D",35000));
		q.offer(new Employee(1,"c",15000));
		q.offer(new Employee(4,"A",65000));
		
		while(!q.isEmpty()) {
			Employee ele=q.poll();
			System.out.println("Popped:"+ele);
		}


	}

}
