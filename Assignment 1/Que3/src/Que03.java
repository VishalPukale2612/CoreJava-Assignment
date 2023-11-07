import java.util.Scanner;

public class Que03 {



	static int totalAmount=0;
	static int finalQuantity=0;

	static void calculateBill(int price){
		totalAmount = totalAmount + price*finalQuantity;
		System.out.println("Total = Rs" + totalAmount);
	}
	
	static void acceptQuantity(){
		
		System.out.println("Enter quantity -");
		Scanner sc=new Scanner(System.in);
		int quantity=sc.nextInt();
		finalQuantity=quantity;
	}
	
	static void printTotalAmount() {
		System.out.println("Your final Bill is - Rs " + totalAmount);
	}	
	
	static int menu() {
		System.out.println("Select Food items form Menu !");
		System.out.println();
		System.out.println("0.To Exit Menu");
		System.out.println("1.Dosa 		: Rs.40");
		System.out.println("2.Samosa 	: Rs.15");
		System.out.println("3.Idli 		: Rs.25");
		System.out.println("4.Poha 		: Rs.10");
		System.out.println("5.Dhokla 	: Rs.20");
		System.out.println("6.Generate Bill");
		
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice ;
		boolean transactionCompleted = false;
		
		while (!transactionCompleted && (choice =menu()) != 0) {
					
			switch(choice) {
			
			case 1: 
				acceptQuantity();
				calculateBill(40);
			break;
			
			case 2: 
				acceptQuantity();
				calculateBill(15);
			break;
			
			case 3: 
				acceptQuantity();
				calculateBill(25);
			break;
			
			case 4: 
				acceptQuantity();
				calculateBill(10);
			break;
			
			case 5: 
				acceptQuantity();
				calculateBill(20);
			break;
			
			case 6: 
				printTotalAmount();
				transactionCompleted = true;
			break;
			
			default: System.out.println("Entere Right Choice");
			System.out.println("");
				
			}
		}

		System.out.println("Thank you for Visiting !");

	}

}
