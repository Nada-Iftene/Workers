import java.sql.*;

public class Dbconnect {
  public static void main( String args[] ) {
      Connection c = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         System.out.println("Opened database successfully");
                c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
   }
}