package que03;

public class TesterProgram {

	public static void main(String[] args) throws CloneNotSupportedException {
//		Date d1=new Date();
//		d1.acceptData();
//		d1.displayDate();
//		
//		Date d2=(Date) d1.clone();
//		System.out.println("Object d2 after clone");
//		d2.displayDate();
//		d2.setDay(22);
//		System.out.println("Object d2 after setDay = 22 ");
//		d2.displayDate();
		
		Person p1= new Person(7025,"Ravi",new Date(31,01,1997));
		p1.displayData();
		Person p2= (Person)p1.clone();
		p2.displayData();
		p2.getDob().setMonth(12);
		p2.displayData();
		p2.setName("tarun");
		p2.displayData();
	}

}
