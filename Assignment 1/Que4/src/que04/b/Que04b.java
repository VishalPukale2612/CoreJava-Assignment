package que04.b;

public class Que04b {

	public static void main(String[] args) {
		int base = 5;
		for(int row=1;row<=base;row++) {
			
				for(int space= 5;space>=row;space--) {
				System.out.print(" ");
				}
				
				int strNo=(row*2)-1;
				for(int star=0;star<strNo;star++) {
				System.out.print("*");
				}
				
			System.out.println("");
		}

		int base2 = 4;
		for(int row=1;row<=base;row++) {
			
			for(int space= 0;space<=row;space++) {
				System.out.print(" ");
			}
			int strNo=(base2*2)-1;
			base2--;
			for(int star=0;star<strNo;star++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}

	}


}
