
package com.library.ui;
import java.util.Scanner;
import com.library.dao.*;
public class MainApp{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  StudentDAO s=new StudentDAO();
  BookDAO b=new BookDAO();
  IssueDAO i=new IssueDAO();
  while(true){
   System.out.println("1.Add Student");
   System.out.println("2.Delete Student");
   System.out.println("3.Add Book");
   System.out.println("4.Issue Book");
   System.out.println("5.Return Book");
   System.out.println("6.Exit");
   int ch=sc.nextInt();
   try{
    switch(ch){
     case 1: System.out.print("ID:"); int sid=sc.nextInt(); sc.nextLine(); System.out.print("Name:"); String n=sc.nextLine(); s.addStudent(sid,n); break;
     case 2: System.out.print("ID:"); s.deleteStudent(sc.nextInt()); break;
     case 3: System.out.print("Book ID:"); int bid=sc.nextInt(); sc.nextLine(); System.out.print("Title:"); String t=sc.nextLine(); System.out.print("Author:"); String a=sc.nextLine(); b.addBook(bid,t,a); break;
     case 4: System.out.print("Student ID:"); int st=sc.nextInt(); System.out.print("Book ID:"); int bk=sc.nextInt(); i.issueBook(st,bk); break;
     case 5: System.out.print("Book ID:"); i.returnBook(sc.nextInt()); break;
     default: return;
    }
   }catch(Exception e){e.printStackTrace();}
  }
 }
}
