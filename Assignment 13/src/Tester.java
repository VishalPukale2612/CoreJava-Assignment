import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
enum Operations{Exit, AddCandidate, UpdateCandidate, DeleteCandidate,
	FindCandidate, DislayAll, DisplayCandidatesByParty, Invalid}
public class Tester {
	public static Operations menu()
	{
		System.out.println("Please enter your choice: ");
		System.out.println("0. Exit");
		System.out.println("1. Add a candidate");
		System.out.println("2. Update a candidate");
		System.out.println("3. Delete a candidate");
		System.out.println("4. Find a candidate");
		System.out.println("5. Display all candidates");
		System.out.println("6. Display candidates by party");
		int choice = new Scanner(System.in).nextInt();
		if(choice < 0 || choice > 6)
			return Operations.Invalid;
		return Operations.values()[choice];
	}
	public static Candidate acceptCandidateToInsert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter party: ");
		String party = sc.next();
		System.out.println("Enter votes: ");
		int votes = sc.nextInt();
		Candidate C= new Candidate(0, name, party, votes); 
		return C;
	}
	public static Candidate acceptCandidateToUpdate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter party: ");
		String party = sc.next();
		System.out.println("Enter votes: ");
		int votes = sc.nextInt();
		Candidate C= new Candidate(id, name, party, votes); 
		return C;
	}
	public static void printRowsAffected(int rows)
	{
		System.out.println("Rows affected: " + rows);
	}
	public static void main(String[] args) throws Exception 
	{
		Operations choice;
		Scanner sc = new Scanner(System.in);
		try(CandidateDao dao = new CandidateDao())
		{
			while((choice = menu()) != Operations.Exit)
			{
				switch(choice)
				{
				case AddCandidate:
				{
					Candidate C = acceptCandidateToInsert();
					printRowsAffected(dao.insertCandidate(C));
				}
					break;
				case UpdateCandidate:
				{
					Candidate C = acceptCandidateToUpdate();
					printRowsAffected(dao.updateCandidate(C));
				}
					break;
				case DeleteCandidate:
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					printRowsAffected(dao.deleteCandidate(id));
				}
					break;
				case FindCandidate:
				{
					Candidate C = null;
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					try {
					C = dao.findCandidate(id);
					System.out.println(C.toString());
					}
					catch(Exception e)
					{
						System.out.println("Candidate not found.");
					}
				}
					break;
				case DislayAll:
				{
					List<Candidate> list = dao.displayAll();
					list.forEach(s -> System.out.println(s.toString()));
				}
					break;
				case DisplayCandidatesByParty:
				{
					System.out.println("Enter party: ");
					String party = sc.next();
					List<Candidate> list = dao.displayCandidatesByParty(party);
					list.forEach(s -> System.out.println(s.toString()));	
				}
					break;
				case Invalid:
					System.out.println("Invalid choice");
				}
			}
		}
	}
}
