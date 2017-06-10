package address.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBSingletonTest {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public DBSingletonTest() {
        
        try {
            conn = DBConnection.getConnection();
            
            String sql = "insert into MEMBER(id,pw,name) values(?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "가족");
            pstmt.setString(2, "홍길동");
            pstmt.setString(3, "강남");            
            int r = pstmt.executeUpdate();

            sql = "select * from MEMBER"; 
            pstmt = conn.prepareStatement(sql); 
            rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("id")+", "+rs.getString("name")+", "+rs.getString("address"));
            }
            rs.close();
            pstmt.close();
            conn.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new DBSingletonTest();
    }
}
