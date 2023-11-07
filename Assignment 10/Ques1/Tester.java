package Ques3;
import java.util.*;
public class Tester {
    
	public static int menu() {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.Add new Book in list");
		System.out.println("2.Display all books i n forward order");
		System.out.println("3.Delete book of given id");
		System.out.println("4.Check if book of given ISBN present or not");
		System.out.println("5.Delete all books");
		System.out.println("6.Display all books");
		System.out.println("Please enter choice");
		choice=sc.nextInt();
		return choice;
		
		
	}
	public static void main(String[] args) {
		
		Collection<Book> b= new ArrayList<>();
		/*
		b.add(new Book("1234","sai",223.34,5));
		b.add(new Book("5678","sairam",234.56,8));
		b.add(new Book("1234","om",235.67,4));
		*/
		
		int choice;
         while((choice=menu())!=0) {
        	 
        	 switch(choice) {
        	 
        	 case 1:
        		    Scanner sc=new Scanner(System.in);
        	    	System.out.println("plesae enter ISBN number");
        	    	String ISBN=sc.next();
        	    	System.out.println("please enter author");
        	    	String author=sc.next();
        	    	System.out.println("please enter price");
        	    	double price=sc.nextDouble();
        	    	System.out.println("please enter quantity");
        	    	int quantity=sc.nextInt();
        	    	b.add(new Book(ISBN,author,price,quantity));
        	    	break;
        	    	
        	 case 2:
        		     Iterator<Book>itr=b.iterator();
        		     while(itr.hasNext()) {
        		    	 Book b1 =itr.next();
        		    	 System.out.println(b1);
        		     }
        		     
        		     break;
        		     
        	 case 3:  
        		     Scanner sc1=new Scanner(System.in);
        		     System.out.println("please enter ISBN number");
        	          String ISBN1=sc1.next();
        	          Book b22=new Book();
        	          b22.setISBN(ISBN1);
        	          b.remove(b22);
        	          break;
        	 case 4:
        		      Scanner sc2=new Scanner(System.in);
        		      System.out.println("Please enter ISBN number");
        		      String ISBN3=sc2.next();
        		      Book b11=new Book();
        		      b11.setISBN(ISBN3);
        		      if(b.contains(b11)) {
        		    	  System.out.println("Book found");
        		      }
        		      else {
        		    	  System.out.println("Book not found");
        		      }
        		    break;
        		    
        	 case 5:
        		 
        		     b.clear();
        		     System.out.println("All Books are deleted");
        		     break;
        	 case 6:
        		    System.out.println("number of books is="+b.toString());
        	 }      
        	 
        	 
         }
	}

}
