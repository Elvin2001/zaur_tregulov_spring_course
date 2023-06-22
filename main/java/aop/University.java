package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Elvin Abaev", 1, 7.8);
        Student st2 = new Student("Zaur Tregulov", 4, 8.8);
        Student st3 = new Student("Azram Chigatuev", 2, 9.2);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
