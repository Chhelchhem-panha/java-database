import model.Student;
import service.StudentServiceImpl;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {

//        StudentServiceImpl.insertStudent(new Student(1001, "Panha", "Male", "E1", 90, new Timestamp(2023)));

        System.out.println(StudentServiceImpl.getAllStudents());

    }
}