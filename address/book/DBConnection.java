package address.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  private static Connection conn;
  private DBConnection (){}
  
  public static Connection getConnection(){
    if(conn != null) {
      return conn;
    }
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn=DriverManager.getConnection("jdbc:mysql://localhost/test","USER","PASSWORD");
      System.out.println("���� ����");
    } catch (ClassNotFoundException e) {
      System.out.println("����̹��� ã���������ϴ� : "+e);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }
}