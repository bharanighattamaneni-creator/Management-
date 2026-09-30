
package com.library.dao;
import java.sql.*; import com.library.util.DBConnection;
public class IssueDAO{
 public void issueBook(int sid,int bid)throws Exception{
  Connection c=DBConnection.getConnection();
  PreparedStatement p=c.prepareStatement("insert into issues(student_id,book_id) values(?,?)");
  p.setInt(1,sid); p.setInt(2,bid); p.executeUpdate();
  c.createStatement().executeUpdate("update books set available=false where id="+bid);
  c.close();
 }
 public void returnBook(int bid)throws Exception{
  Connection c=DBConnection.getConnection();
  c.createStatement().executeUpdate("update books set available=true where id="+bid);
  c.close();
 }
}
