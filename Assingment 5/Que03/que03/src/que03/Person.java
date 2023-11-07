package que03;

public class Person implements Cloneable{
  private int rollNo;
  private String name;
  private Date dob;
  
  @Override
  public Object clone() throws CloneNotSupportedException {
	  Person temp = (Person)super.clone();
	  temp.dob=(Date)this.dob.clone();
	  return temp;
	  
  }
  //------------------------------------------------------

	public Person(int rollNo, String name, Date dob) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
	}
  //------------------------------------------------------
	//setter

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	//-----------------------------------------------------
	public void displayData() {
		System.out.println("roll No : " +this.rollNo);
		System.out.println("Name : "+this.name);
		System.out.print("Date of Birth : ");
		this.dob.displayDate();
	}
	//-----------------------------------------------------

	public Date getDob() {
		return dob;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
  
}
