package Utilidad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AgendaEntity {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("agenda");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

}
