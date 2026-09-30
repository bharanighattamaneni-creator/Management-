
package com.library.dao;
import java.sql.*; import com.library.util.DBConnection;
public class BookDAO{
 public void addBook(int id,String title,String author)throws Exception{
  Connection c=DBConnection.getConnection();
  PreparedStatement p=c.prepareStatement("insert into books values(?,?,?,true)");
  p.setInt(1,id); p.setString(2,title); p.setString(3,author);
  p.executeUpdate(); c.close();
 }
}
