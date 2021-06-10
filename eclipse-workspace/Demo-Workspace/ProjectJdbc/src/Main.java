import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException  {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Employee Details: ID-NAME-EMAIL"); int id =
        Integer.parseInt(reader.readLine()); String name = reader.readLine(); String
        email = reader.readLine();
        
        Employee emp = new Employee(); emp.setId(id); emp.setName(name);
        emp.setEmail(email);
       



      Connection con = (Connection) DbUtil.getCon();
      
      PreparedStatement ps = ((java.sql.Connection) con).prepareStatement("INSERT INTO EMP(id,name,email) VALUES(?,?,?)");
      ps.setInt(1, emp.getId());
      ps.setString(2, emp.getName());
      ps.setString(3, emp.getEmail());
      
      int i = ps.executeUpdate();



      //Statement st = con.createStatement();



      //int i= st.executeUpdate("INSERT INTO EMP(id,name,email) VALUES(116, 'saif', 'saif@ct.com')");
      
      if(i ==1)
          System.out.println("One Record Inserted!!");
		
	}

}
