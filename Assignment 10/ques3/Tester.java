import java.util.*;
public class Tester {

	public static int menu() {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.Add new employee in list");
		System.out.println("2.Display all employee i n forward order using random access");
		System.out.println("3.search employee of given ID");
		System.out.println("4.Delete employee with given index");
		System.out.println("5.Delete employee with given Fname");
		System.out.println("6.sort employee with ID ASC order");
		System.out.println("7.Edit the employee");
		System.out.println("Please enter choice");
		choice=sc.nextInt();
		return choice;
			
	}
	
	public static void main(String[] args) {
		
		
      List<Employee> b= new LinkedList<>();
		
		int choice;
         while((choice=menu())!=0) {
        	 Scanner sc=new Scanner(System.in);
        	 switch(choice) {
        	 
        	 case 1:  
        		 System.out.println("plesae enter id of employee");
	             int id=sc.nextInt();
	             System.out.println("please enter Fname of employee");
	             String Fname=sc.next();
	             System.out.println("please enter Lname of employee");
	             String  Lname=sc.next();
	             System.out.println("please enter salary of employee");
	             Double sal=sc.nextDouble();
	             b.add(new Employee(id,Fname,Lname,sal));
    		       break;
    		       
        	 case 2:
        		    
        		 for(int i=0;i<b.size();i++) {
   		    	  Employee b1=b.get(i);
   		    	  System.out.println(b1);
   		      }
   		     
   		     
   	                  break;
   	                  
   	                  
        	 case 3:
        		 System.out.println("please enter ID of employee you want to find");
		             int id1=sc.nextInt();
		                Employee b33=new Employee();
		              b33.setId(id1);
		                int index12=b.indexOf(b33);
		                 if(index12==-1) {
		    	                System.out.println("Employee not found");
		                 }
		                 else {
		                	 System.out.println("Employee  found at index ="+index12);
		                 }      
   		               break;
   		               
        	 case 4: 
        		     int index9;
	                System.out.println("please enter index of employee u want to remove");
	                index9=sc.nextInt();
	                Employee b5=b.remove(index9);
	                System.out.println(" this employee removed  "+b5);
 		    
 		     break;
 		     
        	 case 5:
        		 
        		 System.out.println("please enter Fname of employee you want to delete");
	              String fname22=sc.next();
   		        for(int i=0;i<b.size();i++) {
	    		         Employee b77=b.get(i);
	    		        if(b77.getFname().equals(fname22)) 
	    		        {
	    			  
	    		        	b.remove(i);
	    			 
	    		  }
	    		  
	    	  }
   		         break;
   		         
        	 case 6:
        		   System.out.println("Before Sorting");
   		               for(int i=0;i<b.size();i++) {
   		    	      Employee b30=b.get(i);
   		    	         System.out.println(b30);
   		              }
   		     
   		        Collections.sort(b, new SortEmployeeByid());
   		     
   		     
   		              System.out.println("After Sorting ");
   		     
   		                  for(int i=0;i<b.size();i++) {
	    	                Employee b30=b.get(i);
	    	               System.out.println(b30);
	                      }
   		     
   		             break;
        	 case 7:
        		     
        		 System.out.println("Enter emp id to be modified: ");
        		 int id12 = sc.nextInt();
        		 Employee key = new Employee();
        		 key.setId(id12);
        		 int index38 = b.indexOf(key);
        		 if(index38 == -1)
        		 System.out.println("Employee not found.");
        		 else {
        		 Employee oldEmp = b.get(index38);
        		 System.out.println("Employee Found: " + oldEmp);
        		 System.out.println("Enter new information for the Employee");
        		 System.out.println("plesae enter id of employee");
	             int id99=sc.nextInt();
	             System.out.println("please enter Fname of employee");
	             String Fname99=sc.next();
	             System.out.println("please enter Lname of employee");
	             String  Lname99=sc.next();
	             System.out.println("please enter salary of employee");
	             Double sal99=sc.nextDouble();
	             Employee newEmp = new Employee(id99,Fname99,Lname99,sal99);
        		 b.set(index38, newEmp);
        		 }
        	   break;
	}

}
	}
}
