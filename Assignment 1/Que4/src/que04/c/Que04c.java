package que04.c;

public class Que04c {

public static void main(String[] args) {
		
		for(int i = 0;i<6;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
				
			for(int star=0;star<=i;star++) {
					System.out.print("*");	
					
			}
			System.out.println("");
		}

	}

}
