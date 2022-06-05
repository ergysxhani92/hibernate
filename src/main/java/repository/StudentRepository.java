package repository;

import java.util.List;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentRepository {
    public Student saveStudent(Student student) {

        //  KRIJOJME NJE SessionFactory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();


        //  NGA SessionFactory DO MARRIM NJE session
        Session session = factory.getCurrentSession();

        //  DO STARTOJME NJE transaksion
        session.beginTransaction();

        //  KRYEJME save(insert)
        session.save(student);

        //  COMMIT transaction
        session.getTransaction().commit();

        //  Close SessionFactory
        factory.close();

        return student;
    }

    public Student getStudentById(int id) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();


        //  NGA SessionFactory DO MARRIM NJE session
        Session session = factory.getCurrentSession();

        //  DO STARTOJME NJE transaksion
        session.beginTransaction();

        //  Marrim studentin
        Student student = session.get(Student.class, id);

        //  COMMIT transaction
        session.getTransaction().commit();

        //  Close SessionFactory
        factory.close();

        return student;
    }

    public List<Student> getStudents() {
        //KRIJOJME NJE SessionFactory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();


        //  NGA SessionFactory DO MARRIM NJE session
        Session session = factory.getCurrentSession();

        //  DO STARTOJME NJE transaksion
        session.beginTransaction();

        //  Marrim listen me objekte
        String query = "select s from Student s";
        session.createQuery(query, Student.class);
        List<Student> students = session.createQuery(query, Student.class).getResultList();


        //  COMMIT transaction
        session.getTransaction().commit();

        //  Close SessionFactory
        factory.close();

        return students;
    }
    public Student updateStudent(Student student){
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //  NGA SessionFactory DO MARRIM NJE session
        Session session = factory.getCurrentSession();

        //  DO STARTOJME NJE transaksion
        session.beginTransaction();

        //  Modifikojme studentin
        session.update(student);

        //  COMMIT transaction
        session.getTransaction().commit();

        //  Close SessionFactory
        factory.close();

        return student;
    }
    public void deleteStudent(int id){
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //  NGA SessionFactory DO MARRIM NJE session
        Session session = factory.getCurrentSession();

        //  DO STARTOJME NJE transaksion
        session.beginTransaction();

        //  Fshijme studentin
        Student student= session.get(Student.class, id);
        session.delete(student);

        //  COMMIT transaction
        session.getTransaction().commit();

        //  Close SessionFactory
        factory.close();
    }
}

