package repository;

import model.Kursi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class KursiEntityManagerRepository {

    public Kursi insertKursi(Kursi kursi) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentEM");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(kursi);

        entityManager.getTransaction().commit();

        return kursi;
    }

    public Kursi getKursiId(int id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentEM");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Kursi kursi = entityManager.find(Kursi.class, id);

        entityManager.getTransaction().commit();

        return kursi;
    }

    public List<Kursi> getKursi() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentEM");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createNativeQuery("SELECT * FROM student.kursi");

        List list = query.getResultList();

        entityManager.getTransaction().commit();

        return list;
    }

    public Kursi updateCourse(Kursi kursi) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentEM");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.merge(kursi);

        entityManager.getTransaction().commit();

        return kursi;
    }

    public void deleteKursi(int id) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentEM");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Kursi kursi = entityManager.find(Kursi.class, id);
        entityManager.remove(kursi);

        entityManager.getTransaction().commit();
    }
}
