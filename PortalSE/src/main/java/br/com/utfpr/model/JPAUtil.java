package br.com.utfpr.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author carlos
 *
 */
public class JPAUtil {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TelaPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void close(EntityManager em) {
        em.close();
    }
}
