package activity;

import java.util.Scanner;

public class classStudentDemo {
   public static void main(String[] args) {
      classStudent newStudent = new classStudent();
         String Fname = "";
         String Mname = "";
         String Lname = "";
         String suffix = "";
      
      
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("Enter your FirstName: ");
      Fname = sc.nextLine();
      System.out.println("Enter your MiddleName: ");
      Mname = sc.nextLine();
      System.out.println("Enter your LastName: ");
      Lname = sc.nextLine();
      System.out.println("Enter your suffix: ");
      suffix = sc.nextLine();
     
     newStudent.setFirstName(Fname);
     newStudent.setMiddleName(Mname);
     newStudent.setLastName(Lname);
     newStudent.setSuffix(suffix);
     
     System.out.println();
     System.out.println("First Name: "+ newStudent.getFirstName());
     System.out.println("Middle Name: "+ newStudent.getMiddleName());
     System.out.println("Last Name: "+ newStudent.getLastName());
     System.out.println("Suffix: " +newStudent.getSuffix());
     System.out.println("FullName: " +newStudent.getFullName());
 }
}