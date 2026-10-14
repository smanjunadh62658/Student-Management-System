package studentservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import student.*;
public class StudentService {
    Scanner sc = new Scanner(System.in);
    List<Student> students = new ArrayList<Student>();
    
    public void addStudent(Student student){
        students.add(student);
    }
    public void searchStudent(int id){
        for (Student student : students) {
            if(student.getId() == id){
                student.getStudentDetails();
            } 
            return;
        }
        System.out.println("Student not found");
    }

    public void updateMarks(int id){
        for (Student student : students) {
            if(student.getId() == id){
                System.out.print("Enter the updated marks :");
                int marks = sc.nextInt();
                student.setMarks(marks);
                System.out.println("Marks updated successfully");
                return;
            } 
        }
        System.out.println("Student not found");
    }
    public void displayList(){
        for (Student student : students) {
            student.getStudentDetails();
        }
    }
    public void deleteStudent(int id){
        for (Student student : students) {
            if(student.getId() == id){
                students.remove(student);
                return ;
            }
        }
        System.out.println("Student not found");
    }
}
