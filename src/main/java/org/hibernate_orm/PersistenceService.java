package org.hibernate_orm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class PersistenceService {
    private static EntityManager em;

    public static void savePerson(PersonEntity person) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
    }

    private static EntityManager getEntityManager() {
        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.hibernate_orm.cool");
            em = emf.createEntityManager();
        }

        return em;
    }
}
