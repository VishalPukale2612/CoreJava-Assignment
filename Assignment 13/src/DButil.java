import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil 
{
	public static final String user = "D2_80343_Pratik";
	public static final String password = "80343";
	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/java";
	
	static 
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(URL, user, password);
	}
}
