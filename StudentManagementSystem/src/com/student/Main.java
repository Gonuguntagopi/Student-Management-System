package com.student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        while (true) {
            System.out.println("1. Add Student\n2. View Students\n3. Delete Student\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Roll No, Name, Dept, Marks:");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();
                    String dept = sc.nextLine();
                    double marks = sc.nextDouble();
                    Student s = new Student(roll, name, dept, marks);
                    service.addStudent(s);
                    break;
                case 2:
                    service.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No to delete: ");
                    int delRoll = sc.nextInt();
                    if (service.deleteStudent(delRoll)) {
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
