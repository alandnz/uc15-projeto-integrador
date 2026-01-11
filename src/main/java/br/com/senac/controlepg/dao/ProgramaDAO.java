package br.com.senac.controlepg.dao;

import br.com.senac.controlepg.jpa.JPAUtil;
import br.com.senac.controlepg.model.Programa;
import jakarta.persistence.EntityManager;
import java.util.List;

public class ProgramaDAO {

    public List<Programa> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Programa p ORDER BY p.programa", Programa.class).getResultList();
        } finally {
            em.close();
        }
    }
}
