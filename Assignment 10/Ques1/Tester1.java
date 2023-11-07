package Ques1;
import java.util.*;
public class Tester1 {

	public static int menu() {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.Add new Bookkss in list");
		System.out.println("2.Add new Bookkss in list if not present &sum its qty");
		System.out.println("3.Display all Bookksss i n forward order using random access");
		System.out.println("4.search Bookkss of given ISBN");
		System.out.println("5.Delete book with given index");
		System.out.println("6.Delete book with given ISBN");
		System.out.println("7.Delete book with given name");
		System.out.println("8.sort book with ISBN ASC order");
		System.out.println("9.sort book with price DESC order");
		System.out.println("10.Reverse the list");
		System.out.println("Please enter choice");
		choice=sc.nextInt();
		return choice;
			
	}
	
	public static void main(String[] args) {
		
		List<Bookkss> b= new ArrayList<>();
		
		int choice;
         while((choice=menu())!=0) {
        	 Scanner sc=new Scanner(System.in);
        	 switch(choice) {
        	 
        	 
        	 case 1:  
        	         
    	             System.out.println("plesae enter ISBN number");
    	             String ISBN=sc.next();
    	             System.out.println("please enter author");
    	             String author=sc.next();
    	             System.out.println("please enter price");
    	             double price=sc.nextDouble();
    	             System.out.println("please enter quantity");
    	             int quantity=sc.nextInt();
    	                     
        		        b.add(new Bookkss(ISBN,author,price,quantity));
        		       break;
        	    	
        	 case 2:
        		       Scanner sc1=new Scanner(System.in);
        		      System.out.println("please enter ISBN of book you want to find");
        		      String Isbn1=sc1.next();
        		      Bookkss b2=new Bookkss();
        		      b2.setISBN(Isbn1);
        		      int index=b.indexOf(b2);
        		      if(index==-1) {
        		    	  System.out.println("Book not found pls add book");
        		    	 
         	             System.out.println("plesae enter ISBN number");
         	             String ISBN1=sc1.next();
         	             System.out.println("please enter author");
         	             String author1=sc1.next();
         	             System.out.println("please enter price");
         	             double price1=sc1.nextDouble();
         	             System.out.println("please enter quantity");
         	             int quantity1=sc1.nextInt();
         	                     
             		        b.add(new Bookkss(ISBN1,author1,price1,quantity1));
        		    	  
        		      }
        		      
        		      else {
        		    	  
        		    	  System.out.println("Book is found");
        		    	  System.out.println("Please enter quantity to add");
        		    	  int qty=sc.nextInt();
        		    	  for(int i=0;i<b.size();i++) {
        		    		  Bookkss b5=b.get(i);
        		    		  if(b5.getISBN().equals(Isbn1)) {
        		    			  
        		    			 int qty2=b5.getQuantity();
        		    			 int sum=qty2+qty;
        		    			 b5.setQuantity(sum);
        		    		  }
        		    		  
        		    	  }
        		    	  
        		      }
        		     
        		     break;
        		     
        	 case 3:  
        		      for(int i=0;i<b.size();i++) {
        		    	  Bookkss b1=b.get(i);
        		    	  System.out.println(b1);
        		      }
        		     
        		     
        	          break;
        	 case 4:
        		
   		          System.out.println("please enter ISBN of book you want to find");
   		              String Isbn2=sc.next();
   		                Bookkss b33=new Bookkss();
   		              b33.setISBN(Isbn2);
   		                int index12=b.indexOf(b33);
   		                 if(index12==-1) {
   		    	                System.out.println("Book not found pls add book");
   		                 }
   		                 else {
   		                	 System.out.println("Book found at index ="+index12);
   		                 }
   		    	 
        		      
        		      
        		      
        		    break;
        		    
        	 case 5:
        		        int index1;
   		                System.out.println("please enter index of book u want to remove");
   		                index1=sc.nextInt();
   		                Bookkss b3=b.remove(index1);
   		                System.out.println("This book is removed  "+b3);
        		    
        		     break;
        		     
        	 case 6:
        		      System.out.println("please enter ISBN of book you want to delete");
		              String Isbn22=sc.next();
        		        for(int i=0;i<b.size();i++) {
		    		         Bookkss b7=b.get(i);
		    		        if(b7.getISBN().equals(Isbn22)) {
		    			  
		    		        	b.remove(i);
		    			 
		    		  }
		    		  
		    	  }
        		         break;
        		     
        	 case 7:
        		     System.out.println("please enter author of book you want to delete");
	                 String author23=sc.next();
   		              for(int i=0;i<b.size();i++) {
	    		         Bookkss b77=b.get(i);
	    		        if(b77.getAuthor().equals(author23)) {
	    			  
	    		        	b.remove(i);
        		    
        	                  }      
                              }
   		               break;
        	 case 8:
        		      System.out.println("Before Sorting");
        		      for(int i=0;i<b.size();i++) {
        		    	  Bookkss b1=b.get(i);
        		    	  System.out.println(b1);
        		      }
        		     
        		     Collections.sort(b, new SortBookIsbn());
        		     System.out.println("After Sorting ");
        		     for(int i=0;i<b.size();i++) {
       		    	  Bookkss b1=b.get(i);
       		    	  System.out.println(b1);
       		      }
        		     
        		     break;
        		     
        	 case 9:
        		    System.out.println("Before Sorting");
   		            for(int i=0;i<b.size();i++) {
   		    	         Bookkss b1=b.get(i);
   		    	         System.out.println(b1);
   		                 }
        		      Collections.sort(b, new SortBookPrice());
        		      
        		      System.out.println("After Sorting ");
         		           for(int i=0;i<b.size();i++) {
        		    	  Bookkss b1=b.get(i);
        		    	  System.out.println(b1);
        		          }
         		           break;
         		           
        	 case 10:
        		 
        		       System.out.println("Before reverse");
		                for(int i=0;i<b.size();i++) {
		    	           Bookkss b1=b.get(i);
		    	            System.out.println(b1);
		                       }
		                Collections.reverse(b);
		                System.out.println("after reverse");
		                for(int i=0;i<b.size();i++) {
		    	           Bookkss b1=b.get(i);
		    	            System.out.println(b1);
		                       }
		                break;
        		     
	}

         }
	}
}
	


