
package com.library.dao;
import java.sql.*; import com.library.util.DBConnection;
public class StudentDAO{
 public void addStudent(int id,String name)throws Exception{
  Connection c=DBConnection.getConnection();
  PreparedStatement p=c.prepareStatement("insert into students values(?,?)");
  p.setInt(1,id); p.setString(2,name); p.executeUpdate(); c.close();
 }
 public void deleteStudent(int id)throws Exception{
  Connection c=DBConnection.getConnection();
  PreparedStatement p=c.prepareStatement("delete from students where id=?");
  p.setInt(1,id); p.executeUpdate(); c.close();
 }
}
