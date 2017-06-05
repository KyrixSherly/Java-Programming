package com.sd.dao.V0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0{
  public static void main(String[] args){
    //�̸� ��������� ���� �� �ִ�.
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
      //String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";   //ddl ���̺� ����� ��  
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      String mySql="INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      String mySql="select name from persons where id<5 order by id";  //���Ǹ� �� ���� ����� �޶����� 
      
      stmt=conn.createStatement();
      //stmt.execute(mySql);
      rs=stmt.executeQuery(mySql);   //��ü�� ��ȯ�ȴ�.  iterator�̴�.    // String mySql="select name from persons where id<5 order by id"; �ֶ� ��Ʈ
      while(rs.next()){
        System.out.println(rs.getString("name"));    //name�� ��µȴ�.������ �ÿ�  
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
    //���α׷��� �ߵ��ư��� finally�� ����.
    finally{
      try{
        //3���� �� �ݾ���� �Ѵ�.!!!!�ȱ� ����  �޸� ������ ������ ���� ������ ���α׷��� ������ �׾������.
        if(rs!=null)rs.close(); 
        if(stmt!=null)stmt.close();
        if(conn!=null)conn.close();
      }
      catch(Exception e){};
    }
  }
}