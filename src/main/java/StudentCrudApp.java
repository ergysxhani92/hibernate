import model.Student;
import repository.StudentRepository;

import java.util.List;

public class StudentCrudApp {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        int id= 1;
        studentRepository.deleteStudent(id);

//        Student student = createStudent();
//        studentRepository.updateStudent(student);
//        System.out.println(student);

//        List<Student> students = studentRepository.getStudents();
//        System.out.println(students);

        // Student student = getStudent();
        // studentRepository.saveStudent(student);

//        int id=1;
//        Student student= studentRepository.getStudentById(id);
//        System.out.println(student);
    }

    private static Student createStudent() {
        Student student = new Student();
        student.setId(1);
        student.setName("Ergys");
        student.setSurname("Xhani");
        student.setAge(22);
        return student;
    }
}
