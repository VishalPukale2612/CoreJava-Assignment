import java.util.Scanner;

public class Que02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to Calculate Average ");
		double num1;
		double num2;
		try {
			num1= sc.nextDouble();
			num2= sc.nextDouble();
		}
		catch (Exception hi){
			System.out.println("Entered value is not double");
			System.out.println("Please enter valid values");
			return;
		}
		
		System.out.println((num1+num2)/2);
	}

}

