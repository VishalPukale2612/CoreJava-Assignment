package Ques1;
import java.util.*;
public class Bookkss{

    private String ISBN;
    private String author;
    private double price;
    private int quantity;
    
    public Bookkss() {
    	
    }
	public Bookkss(String iSBN, String author, double price, int quantity) {
		
		ISBN = iSBN;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Bookkss [ISBN=" + ISBN + ", author=" + author + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
    public void acceptdata() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("plesae enter ISBN number");
    	this.ISBN=sc.next();
    	System.out.println("please enter author");
    	this.author=sc.next();
    	System.out.println("please enter price");
    	this.price=sc.nextDouble();
    	System.out.println("please enter quantity");
    	this.quantity=sc.nextInt();
    	
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookkss other = (Bookkss) obj;
		return Objects.equals(ISBN, other.ISBN);
	}
	
	

	
    
    
    
}

