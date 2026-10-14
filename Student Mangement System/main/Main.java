package main;
import java.util.*;
import student.Student;
import studentservice.*;

public class Main {
    public static void main(String[] args) {
        // object for Scanner
        Scanner sc = new Scanner(System.in);
        //object for StudentService class to acces the Arraylist
        StudentService service = new StudentService();
        int loopConst = 1;
        while (loopConst == 1) {
            System.out.println("---Student Management System---");
            System.out.println("1.Add student");
            System.out.println("2.Search Student");
            System.out.println("3.Update Marks");
            System.out.println("4.Display full list");
            System.out.println("5.Delete Student");
            System.out.println("6.Close");
            System.out.print("Enter your choice :");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter Student ID :");
                    int id = sc.nextInt();
                    sc.nextLine(); // consumes the leftover Enter
                    System.out.print("Enter Student Name :");
                    String name  = sc.nextLine();
                    System.out.print("Enter Student Age :");
                    int age = sc.nextInt();
                    System.out.print("Enter Student Marks :");
                    int marks = sc.nextInt();

                    Student student = new Student(id,name,age,marks);
                    service.addStudent(student);

                    System.out.println("Student added successfully");
                        break;
                
                case 2:
                    System.out.print("Enter student Id to search :");
                    int id2 = sc.nextInt();
                    // System.out.println(id2);
                    service.searchStudent(id2);
                        break;
                case 3:
                    System.out.print("Enter student Id to Update marks :");
                    int id3 = sc.nextInt();  
                    service.updateMarks(id3); 
                        break;
                case 4:
                    service.displayList();    
                        break;
                case 5:
                    System.out.print("Enter student Id to Update marks :");
                    int id4 = sc.nextInt();    
                    service.deleteStudent(id4);
                        break;
                case 6:
                    loopConst = 0  ;    
                        break;
                
                default:
                    System.out.println("Invalid input...");
                    sc.close();
                    break;
            }
        }
    }
}
