import java.util.Scanner;

public class Que01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int i = sc.nextInt();
		System.out.println("Binary equivalent " + Integer.toBinaryString(i));
		System.out.println("Octal equvalent " + Integer.toOctalString(i));
		System.out.println("Hexadecimal equivalent " + Integer.toHexString(i));

	}

}
