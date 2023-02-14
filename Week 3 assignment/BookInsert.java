package jbdc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class BookInsert {

	// values specific to each database
	   
	   // variables
	   private static   final String url = "jdbc:mysql:///bookdatails";
	   private static final String user = "root";
	   private static  final String password = "root";
	   // SQL Query
	   private static final String INSERT_student_QUERY =
	                "INSERT INTO BookDetails VALUES (?,?,?,?)";
  
		 public static void main(String[] args ) {

		     // declare variables
		     Scanner scan = null;
		     int n = 0;
		     int id = 0;
		     String Bookname = null, Authorname = null;
		     String Edition=null;
		     String query=null;
		     
		     Connection con = null;
		     PreparedStatement ps = null;
		     int result = 0;

		     try {
		        // create Scanner class object
		        scan = new Scanner(System.in);
		        
		        // take number of students
		        if(scan != null) {
		            System.out.print("Enter Number of Book Details: ");
		            n = scan.nextInt();
		        }

		        // establish the connection
		        con = DriverManager.getConnection(url, user, password);
			      // create JDBC statement object
			    

		        // compile SQL query and store it in
		        // PreparedStatement object
		        if(con != null) {
		           ps = con.prepareStatement(INSERT_student_QUERY);
		        }
		        
		        if(scan != null && ps != null) {
		           for(int i=0; i<n; i++) {

		              // read input values
		              System.out.println("\nEnter Book-"+(i+1)+" details,");
		              System.out.println("Book Id: ");
		              id = scan.nextInt();
		              System.out.println("Book Name: ");
		              Bookname = scan.next();
		              System.out.println("Author Name: ");
		              Authorname = scan.next();
		               System.out.println("Edition: ");
		               Edition= scan.next();
		            
		             
		              
		              ps.setInt(1, id);
		              ps.setString(2, Bookname);
		              ps.setString(3, Authorname);
		              
		              ps.setString(4, Edition);
			             
		             
		              

		              // execute the query
		              result = ps.executeUpdate();
		           }
		        }
		        
		        // process the result
		        if(result == 0) {
		           System.out.println("\nRecords insertion failed");
		        } else {
		           System.out.println("\nRecords inserted successfully.");
		        }

		     } 
		    catch(SQLException se) {
		        se.printStackTrace();
		     } catch(Exception e) {
		        e.printStackTrace();
		     } // try-catch block 

		     finally {
		        // close JDBC objects
		        try {
		           if(ps != null) ps.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(con != null) con.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(scan != null) scan.close();
		        } catch(Exception e) {
		           e.printStackTrace();
		        }
		     } // finally
		   } // main()
	}