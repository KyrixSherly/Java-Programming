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
      System.out.println("연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("드라이버를 찾을수없습니다 : "+e);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }
}