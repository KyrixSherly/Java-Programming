package com.sd.dao.V0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0{
  public static void main(String[] args){
    //미리 선언해줘야 읽을 수 있다.
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    try{
      String path=System.getProperty("user.dir");
      path+="/src/mysql.properties.txt";
      Properties prop=new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn=DriverManager.getConnection(
         //"jdbc:mysql://localhost/test",
         prop.getProperty("URL"),
         prop.getProperty("USER"),
         prop.getProperty("PASSWORD")
      );
      //String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";   //ddl 테이블 만드는 것  
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      String mySql="INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      String mySql="select name from persons where id<5 order by id";  //조건명 에 따라 출력이 달라진다 
      
      stmt=conn.createStatement();
      //stmt.execute(mySql);
      rs=stmt.executeQuery(mySql);   //객체로 반환된다.  iterator이다.    // String mySql="select name from persons where id<5 order by id"; 애랑 세트
      while(rs.next()){
        System.out.println(rs.getString("name"));    //name이 출력된다.컴파일 시에  
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
    //프로그램이 잘돌아가면 finally로 간다.
    finally{
      try{
        //3가지 꼭 닫아줘야 한다.!!!!안그 러면  메모리 때문에 당장은 문제 없지만 프로그램이 스스륵 죽어버린다.
        if(rs!=null)rs.close(); 
        if(stmt!=null)stmt.close();
        if(conn!=null)conn.close();
      }
      catch(Exception e){};
    }
  }
}