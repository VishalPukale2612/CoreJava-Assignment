package com.sunbeam;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

enum Operations{Exit, AddNewBook, DisplayAllBooks, SearchABookbyISBN, DeleteABookByIndex,
	DeleteABookByISBN, DeleteABookByAuthorName, SortBooksAsc, SortBooksPriceDesc, Reverse,SaveBook,LoadBook ,Invalid}
public class TesterBook {
	public static Operations menu()
	{
		System.out.println("Please enter your choice: ");
		System.out.println("0. Exit");
		System.out.println("1. Add new book in List");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Delete a book with given author name.");
		System.out.println("7. Sort books by isbn in asc order");
		System.out.println("8. Sort books by price in desc order");
		System.out.println("9. Reverse the list");
		System.out.println("10.Save Book");
		System.out.println("11.Load Book");
		int choice = new Scanner(System.in).nextInt();
		
		if(choice < 0 || choice > 11)
			return Operations.Invalid;
		return Operations.values()[choice];
	}

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		Operations choice;
		
		while((choice = menu()) != Operations.Exit)
		{
			switch(choice)
			{
			case AddNewBook:
			{
				Iterator<Book> iterator = library.iterator();
				Book b = new Book();
				b.accept();
				int index = library.indexOf(b);
				if(index == -1)
					library.add(b);
				else
				library.get(index).setQuantity(library.get(index).getQuantity() + b.getQuantity());
			}
				break;
			case DisplayAllBooks:
			{
				Iterator<Book> iterator = library.iterator();
				while(iterator.hasNext())
				{
					iterator.next().display();
					System.out.println("-------------------------------");
				}
				if(library.size() == 0)
				{
					System.out.println("Library is empty!");
					System.out.println("-------------------------------");
				}
			}
				break;
			case SearchABookbyISBN:
			{
				System.out.println("Please enter ISBN: ");
				String ISBN = new Scanner(System.in).next();
				boolean notFound = true;
				for(int i = 0; i < library.size(); i++)
				{
					if(library.get(i).getIsbn().equals(ISBN))
					{
						library.get(i).display();
						notFound = false;
						break;
					}
				}
				if(notFound)
				{
					System.out.println("Book not found! :(");
					System.out.println("-------------------------------");
				}
			}
				break;
			case DeleteABookByIndex:
			{
				System.out.println("Please enter index: ");
				int index = new Scanner(System.in).nextInt();
				if(index < 0 || index >= library.size())
				{
					System.out.println("Wrong index entered!");
					System.out.println("-------------------------------");
				}
				else
				{
					library.remove(index);
					System.out.println("Book deleted successfully.");
					System.out.println("-------------------------------");
				}
			}
				break;
			case DeleteABookByISBN:
			{
				System.out.println("Please enter ISBN: ");
				String ISBN = new Scanner(System.in).next();
				boolean notFound = true;
				for(int i = 0; i < library.size(); i++)
				{
					if(library.get(i).getIsbn().equals(ISBN))
					{
						library.remove(i);
						notFound = false;
						System.out.println("Book deleted successfully.");
						System.out.println("-------------------------------");
						break;
					}
				}
				if(notFound)
				{
					System.out.println("Book not found! :(");
					System.out.println("-------------------------------");
				}
			}
				break;
			case DeleteABookByAuthorName:
			{
				System.out.println("Please enter author name: ");
				String author = new Scanner(System.in).next();
				boolean notFound = true;
				for(int i = 0; i < library.size(); i++)
				{
					if(library.get(i).getAuthor().equals(author))
					{
						library.remove(i);
						notFound = false;
						System.out.println("Book deleted successfully.");
						System.out.println("-------------------------------");
						break;
					}
				}
				if(notFound)
				{
					System.out.println("No book found with Author: " + author);
					System.out.println("-------------------------------");
				}
			}
				break;
			case SortBooksAsc:
			{
				Collections.sort(library);
			}
				break;
			case SortBooksPriceDesc:
			{
				Collections.sort(library,new BookPriceDescComparator());
			}
				break;
			case Reverse:
			{
				Collections.reverse(library);
			}
				break;
				
			case SaveBook:
				
				try (FileOutputStream fout = new FileOutputStream("Book.bin"))
				{
					try(DataOutputStream dout = new DataOutputStream(fout))
					
					{
						for (Book B:library)
						{
							dout.writeUTF(B.getIsbn());
							dout.writeDouble(B.getPrice());
							dout.writeUTF(B.getAuthor());
							dout.writeInt(B.getQuantity());
							
							
						}
						System.out.println("Book Saved:"+library.size());
					}
					
				}
				catch(Exception e)
				{
				e.printStackTrace();
				}
				break;
				
			case LoadBook:
				
				try(FileInputStream fin= new FileInputStream("Book.bin"))
				{
					try(ObjectInputStream oin  = new ObjectInputStream(fin))
					{
						library = (ArrayList<Book>) oin.readObject();
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				library.forEach(e->System.out.println(e));
				
				break;
			case Invalid:
				System.out.println("Invalid choice! :(");
				System.out.println("-------------------------------");
			}	
		}
	}
}