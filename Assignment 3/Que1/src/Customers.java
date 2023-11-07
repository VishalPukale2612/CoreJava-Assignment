import java.util.Scanner;

public class Customers {
	int accNumber;
	int Balance;
	int allowedCredits;
	int monthsCredits;
	int items;
	
	
	
	public Customers() {
		this.accNumber =0;
		this.Balance = 0;
		this.allowedCredits =0;
		this.monthsCredits =0;
		this.items =0;
	}

	public Customers(int  accNumber, int balance, int allowedCredits, int monthsCredits, int items) {
		this.accNumber = accNumber;
		this.Balance = balance;
		this.allowedCredits = allowedCredits;
		this.monthsCredits = monthsCredits;
		this.items = items;
	}
	
	public void acceptData() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Account Number :- ");
		this.accNumber= sc.nextInt();
		
		System.out.println("Pending Balance :- ");
		this.accNumber= sc.nextInt();
		
		System.out.println("Allowed credits :- ");
		this.accNumber= sc.nextInt();
		
		System.out.println("Months credits :- ");
		this.accNumber= sc.nextInt();
		
		System.out.println("Total Items charged :- ");
		this.accNumber= sc.nextInt();
		
	}
	
	public int calculateBalance() {
		
		this.Balance=Balance+items-monthsCredits;
		return Balance;
	}
	
	public void checkLimit() {
		
	if (this.Balance>this.allowedCredits) {
		System.out.println("Credit Limit Exceeded");
		}
	else System.out.println("Credit Limit not exceeded");
	}
	
	
 
}
