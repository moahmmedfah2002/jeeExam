package ma.ensa.examjee.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.TransactionManager;
import ma.ensa.examjee.dao.Employe;

public class EmployeIml implements Employe {
    private EntityManager em ;
    public EmployeIml() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exam");
        em = emf.createEntityManager();

    }

    @Override
    public void addEmploye(Employe e)throws Exception  {
        EntityTransaction tr=em.getTransaction();
        tr.begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteEmploye(int id) throws Exception {
        EntityTransaction tr=em.getTransaction();
        tr.begin();
        em.createQuery("delete from Employe").executeUpdate();
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void updateEmploye(Employe e) throws Exception {
        EntityTransaction tr=em.getTransaction();
        tr.begin();
        em.merge(e);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public Employe getEmploye(int id) {
        EntityTransaction tr=em.getTransaction();
        tr.begin();
        return (Employe)em.createQuery("from Employe where id="+id).getSingleResult();


    }
}
