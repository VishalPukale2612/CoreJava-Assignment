package com.election;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

 enum Operation { Exit,InsertNewCandidates,DisplayAllCandidates,IncrementVoteById,DeleteCandidateById,FindCandidateById,FindCandidateByParty,TotalVotesForEachParty,Invalid,}


public class Voting1 {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
	public static final String DB_USER = "D2_80719_Vishal";
	public static final String DB_PASSWORD = "80719";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
		public static Operation menu()
		{
			System.out.println("Please enter your choice: ");
			System.out.println("0. Exit");
			System.out.println("1. Insert new candidate");
			System.out.println("2. Display all candidates");
			System.out.println("3.Delete candidate with given id");
			System.out.println("4. Find candidate of given id");
			System.out.println("5. Find candidates of given party");
			System.out.println("6. Display total votes for each party");
		Operation o[] = Operation.values();
		for(Operation element : o)
				System.out.println(element.ordinal() + ": " + element.name());
			@SuppressWarnings("resource")
			int choice = new Scanner(System.in).nextInt();
			if(choice > 6 || choice < 0)
				return Operation.Invalid;
			return Operation.values()[choice];
	}
		public static void main(String[] args) throws SQLException {
			
			Operation choice;
			while((choice = menu()) != Operation.Exit)
			{
				switch(choice)
				{
				case InsertNewCandidates:
					Scanner sc = new Scanner(System.in);
					try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
					
						String sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							System.out.print("Enter Name: ");
							String name = sc.next();
							System.out.print("Enter Party: ");
							String party = sc.next();
							System.out.print("Enter Votes: ");
							int votes = sc.nextInt();
							
							stmt.setString(1, name);
							stmt.setString(2, party);
							stmt.setInt(3, votes);
							
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						} // stmt.close(); 
						
					} // con.close(); 
		
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					
				case DisplayAllCandidates:
					
					try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
						
						String sql = "SELECT * FROM candidates";
						try(Statement stmt = con.prepareStatement(sql)) {
					
							
							try(ResultSet rs = stmt.executeQuery(sql)) {
								while(rs.next()) {
									int id = rs.getInt("id");
									String name = rs.getString("name");
									String party = rs.getString("party");
									int votes = rs.getInt("votes");
									System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
								}
							} // rs.close();
						
						} // stmt.close(); 
						
					} // con.close(); 
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					
				case IncrementVoteById :
					Scanner db = new Scanner(System.in);
					try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
					
						String sql = " UPDATE candidates SET votes = votes + 1 WHERE id = ?";
								
 ; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							System.out.print("Enter id: ");
							int id = db.nextInt();
							
							
							stmt.setInt(1, id);
							
							
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						} // stmt.close(); 
						
					} // con.close(); 
		
					catch (Exception e) {
						e.printStackTrace();
					}
					
					break;
					
				case DeleteCandidateById:
					
					Scanner sb= new Scanner(System.in);
					try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
					
						String sql = " DELETE FROM candidates\n"
								+ "WHERE id =  ?";
								

						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							System.out.print("Enter id: ");
							int id = sb.nextInt();
			
							stmt.setInt(1, id);
						
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						} // stmt.close(); 
						
					} // con.close(); 
		
					catch (Exception e) {
						e.printStackTrace();
					}	
					break;
					
				case FindCandidateById:
					Scanner ds= new Scanner(System.in);
					try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
					
						String sql = "Select * from candidates Where id=? ";
								

						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							System.out.print("Enter id: ");
							int id = ds.nextInt();
			
							stmt.setInt(1, id);
						
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						} // stmt.close(); 
						
					} // con.close(); 
		
					catch (Exception e) {
						e.printStackTrace();
					}	
					break;
					
				case FindCandidateByParty:
					
					Scanner mp= new Scanner(System.in);
					try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
					
						String sql ="select * from candidates where party =?";
								

						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							System.out.print("Enter party: ");
							String party= mp.next();
			
							stmt.setString(1, party);
						
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						} // stmt.close(); 
						
					} // con.close(); 
		
					catch (Exception e) {
						e.printStackTrace();
					}
					
				}
		
			
				}
		
		}

		}
 


	
	
	
	
	