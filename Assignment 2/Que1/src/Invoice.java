
public class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;

	public Invoice() {
	
	}

	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getpartNumber() {
		return partNumber;
	}

	public void setpartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getpartDescription() {
		return partDescription;
	}

	public void setpartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity>=0) {
		this.quantity = quantity;
		}
		else quantity = 0;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>=0) {
			this.price = price;
			}
			else price = 0;
	
	}
	
	public double caculateInvoiceAmount() {
		
		return price*quantity;
	}
	
	void displayInvoice(){
		System.out.println("Part number :- " + partNumber);
		System.out.println("Part Description :- " + partDescription);
		System.out.println("Part quantity :- " + quantity);
		System.out.println("Part price :- " + price);
		
	}
	
}
