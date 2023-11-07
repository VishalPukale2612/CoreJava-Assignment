package que04.a;

public class Que04a {

	public static void main(String[] args) {
		int base = 5;
		for(int row=0;row<base;row++) {
			
			for(int space= 5;space>row;space--) {
				System.out.print(" ");
			}
			
			for(int star=0;star<=row;star++) {
				
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
