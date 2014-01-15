/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.config.DatabaseConfig;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author willian
 */
public class HibernateFactory {

    private static EntityManager entityManager = null;
    private static EntityManagerFactory entityManagerFactory = null;

    public static EntityManager getEntityManager_old() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("mySystem");
        }
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("hibernate.connection.driver", DatabaseConfig.DATABASE_DRIVER);
            map.put("hibernate.connection.url", DatabaseConfig.DATABASE_URL);
            map.put("hibernate.connection.user", DatabaseConfig.DATABASE_USER);
            map.put("hibernate.connection.password", DatabaseConfig.DATABASE_PASSWORD);
            map.put("hibernate.show_sql", DatabaseConfig.HIBERNATE_SHOW_SQL);
            map.put("hibernate.format_sql", DatabaseConfig.HIBERNATE_FORMAT_SQL);
            map.put("hibernate.hbm2ddl.auto", DatabaseConfig.HIBERNATE_CREATE_TABLES);

            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }
}
