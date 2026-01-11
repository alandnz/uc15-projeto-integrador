package br.com.senac.controlepg.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    // Constante para centralizar o nome da unidade de persistência
    private static final String PERSISTENCE_UNIT = "Controlepg-PU";

    private static EntityManager em;
    private static EntityManagerFactory fabrica;

    // Cria a entidade se estiver nula e a retorna
    public static EntityManager getEntityManager() {
        if (fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (em == null || !em.isOpen()) {
            em = fabrica.createEntityManager();
        }

        return em;
    }

    // Fecha o EntityManager e a Factory
    public static void closeEntityManager() {
        if (em.isOpen() && em != null) {
            em.close();
            fabrica.close();
        }
    }
}
