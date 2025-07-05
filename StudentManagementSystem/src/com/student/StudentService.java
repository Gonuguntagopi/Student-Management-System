package com.student;
import java.util.*;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void viewStudents() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public Student findStudent(int rollNo) {
        for (Student s : studentList) {
            if (s.getRollNo() == rollNo) return s;
        }
        return null;
    }

    public boolean deleteStudent(int rollNo) {
        Student s = findStudent(rollNo);
        if (s != null) {
            studentList.remove(s);
            return true;
        }
        return false;
    }
}




