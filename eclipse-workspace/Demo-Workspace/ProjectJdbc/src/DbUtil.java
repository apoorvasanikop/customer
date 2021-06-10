import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	private static Connection connection;
	
	private DbUtil() {}
	
	public static Connection getCon() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Apurva","root","24March@1998");
		}catch (SQLException e) {
			System.out.println("Problem in getting connection from database!!");
		}
		return connection;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
