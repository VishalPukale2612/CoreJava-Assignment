package que03;
import java.util.*;
public class Date implements Cloneable{
	private int day,month,year;
	
	//shallow copy 
	
	public Object clone() throws CloneNotSupportedException{
		Date temp = (Date) super.clone();	
		
		return temp;
	}
	
	//------------------------------------------------------------
			//Constructor
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
	
	}

	//-------------------------------------------------------------
	public void acceptData() {
		Scanner sc= new  Scanner(System.in);
		
		while (true) {
			System.out.print("Enter day : ");
			int temp= sc.nextInt();
			if (temp<=31 && temp>0) {
				this.day=temp;
				break;
			}
			else {
				System.out.println("please enter valid value");
			}
		}
		
		while(true) {
			System.out.print("Enter month : ");
			int temp= sc.nextInt();
			if (temp<=12 && temp>0) {
				this.month=temp;
				break;
			}
			else {System.out.println("please enter valid value");
			}
		}
		
		while(true) {
			System.out.print("Enter Year : ");
			int temp=sc.nextInt();
			if (temp>=1900 && temp<2024) {
				this.year=temp;
				break;
				}
			else { System.out.println("please enter valid value");
			}
		}
	}
	//---------------------------------------------------------------	
	
	public void displayDate() {
		System.out.println("Date : "+this.day +"/"+this.month+"/"+this.year);
	}
	
	//---------------------------------------------------------------
			//Setters 
	
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	//---------------------------------------------------------------
}
