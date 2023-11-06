import java.util.Objects;
import java.util.Scanner;

public class Book {
	private String isbn;
	private double price;
	private String author;
	private int quantity;
	
	public Book(String isbn, double price, String author, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.author = author;
		this.quantity = quantity;
	}
	public Book() {
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=").append(isbn).append(", price=").append(price).append(", author=").append(author)
				.append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ISBN: ");
		this.isbn = sc.next();
		System.out.println("Please enter price: ");
		this.price = sc.nextDouble();
		System.out.println("Please enter author: ");
		this.author = sc.next();
		System.out.println("Please enter quantity: ");
		this.quantity = sc.nextInt();
	}
	public void display()
	{
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Price: " + this.price);
		System.out.println("Author: " + this.author);
		System.out.println("Quantity: " + this.quantity);
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, price, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}
	
}
