import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

enum Operation{Exit, AddNewBook, DisplayAllBooks,
	DeleteBookByID, CheckBookExists, DeleteAllBooks, DisplayNumberOfBooks, Invalid}

public class Tester {	
	public static Operation menu()
	{
		System.out.println("Please enter your choice: ");
		System.out.println("0. Exit");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Delete book of given ISBN");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
//		Operation o[] = Operation.values();
//		for(Operation element : o)
//			System.out.println(element.ordinal() + ": " + element.name());
		int choice = new Scanner(System.in).nextInt();
		if(choice > 6 || choice < 0)
			return Operation.Invalid;
		return Operation.values()[choice];
	}
	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) {
		Collection<Book> c = new ArrayList<>();
		
		Operation choice;
		while((choice = menu()) != Operation.Exit)
		{
			switch(choice)
			{
			case AddNewBook:
			{
				Book b = new Book();
				b.accept();
				c.add(b);
			}
				break;
			case DisplayAllBooks:
			{
				Iterator<Book>i = c.iterator();
				while(i.hasNext())
				{
					i.next().display();
					System.out.println("-------------------------------");
				}
			}
				break;
			case DeleteBookByID:
			{
				Iterator<Book>i = c.iterator();
				System.out.println("Please enter book ISBN: ");
				String ISBN = new Scanner(System.in).next();
				boolean NotExists = true;
				while(i.hasNext())
				{
					if(i.next().getIsbn().equals(ISBN))
					{
						i.remove();
						System.out.println("Book deleted successfully. :)");
						NotExists = false;
						break;
					}
				}
				if(NotExists)	
					System.out.println("Book doesn't exist in the library. :(");
				System.out.println("-------------------------------");
			}
				break;
			case CheckBookExists:
			{
				Iterator<Book>i = c.iterator();
				System.out.println("Please enter book ISBN: ");
				String ISBN = new Scanner(System.in).next();
				boolean NotExists = true;
				while(i.hasNext())
				{
					if(i.next().getIsbn().equals(ISBN))
					{
						System.out.println("Book exists in the library. :)");
						NotExists = false;
						break;
					}
				}
				if(NotExists)
					System.out.println("Book doesn't exist in the library. :(");
				System.out.println("-------------------------------");
				
			}
				break;
			case DeleteAllBooks:
			{
				c.clear();
				System.out.println("All books deleted successfully. :)");
				System.out.println("-------------------------------");
			}
				break;
			case DisplayNumberOfBooks:
			{
				System.out.println("Number of books: " + c.size()); 
				System.out.println("-------------------------------");
			}
				break;
			case Invalid:
				System.out.println("Invalid choice!");
				System.out.println("-------------------------------");
			}
		}
	}
}
