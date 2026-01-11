package br.com.senac.controlepg.dao;

import br.com.senac.controlepg.jpa.JPAUtil;
import br.com.senac.controlepg.model.Cadastro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class CadastroDAO {

    public void salvar(Cadastro cadastro) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(cadastro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    //Exclui o objeto de acordo com o id
    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Cadastro c = em.find(Cadastro.class, id);
            if (c != null) {
                em.getTransaction().begin();
                em.remove(c);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    // Método utilizado para listar todos os podcasts cadastrados no banco
    public List<Cadastro> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query consulta = em.createQuery("SELECT c FROM Cadastro c JOIN FETCH c.programa");
            List<Cadastro> cadastros = consulta.getResultList();
            return cadastros;
        } finally {
            em.close();
        }
    }

    // Sobrescrita do método listar, recebendo um filtro de acordo com o campo de pesquisa
    public List<Cadastro> listar(String filtroSolicitante) {

        // Se não houver nada no campo de pesquisa, chama o método de listar todos
        if (filtroSolicitante == null || filtroSolicitante.trim().isEmpty()) {
            return listar();
        }

        EntityManager em = JPAUtil.getEntityManager();
        // O filtro de busca é pelo programa ou solicitante
        try {
            String textoQuery
                    = "SELECT c FROM Cadastro c "
                    + "JOIN FETCH c.programa p "
                    + "WHERE c.solicitante LIKE :filtro OR p.programa LIKE :filtro";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("filtro", "%" + filtroSolicitante + "%");

            return consulta.getResultList();
        } finally {
            em.close();
        }
    }
}
