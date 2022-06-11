package repository;

import model.Kursi;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class KursiRepository {
    public Kursi insertKursi(Kursi kursi) {

        //  KRIJOJME NJE SessionFactory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();


        //  NGA SessionFactory DO MARRIM NJE session
        Session session = factory.getCurrentSession();

        //  DO STARTOJME NJE transaksion
        session.beginTransaction();

        //  KRYEJME INSERT
        session.save(kursi);

        //  COMMIT transaction
        session.getTransaction().commit();

        //  Close SessionFactory
        factory.close();

        return kursi;
    }
}