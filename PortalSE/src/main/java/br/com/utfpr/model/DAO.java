package br.com.utfpr.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Dao<T> {

    private Class<T> classe;

    public Dao(Class classe) {
        this.classe = classe;
    }

    public void adiciona(T entity) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
        em.close();
    }

    public void edit(T entity) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        em.merge(entity);
        em.flush();
        em.getTransaction().commit();
        em.close();
    }

    public T get(Long id) {
        EntityManager em = new JPAUtil().getEntityManager();
        return (T) em.find(classe, id);
    }

    public void removePorId(Long id) {
        EntityManager em = new JPAUtil().getEntityManager();
        T entity = get(id);
        if (entity == null) {
            return;
        }
        em.getTransaction().begin();
        em.remove(em.merge(entity));
        em.getTransaction().commit();
        em.close();
    }

    public void remove(T entity) {
        EntityManager em = new JPAUtil().getEntityManager();
        if (entity == null) {
            return;
        }
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
        em.close();
    }

    public List<T> listaTodos() {
        EntityManager em = new JPAUtil().getEntityManager();
        return em.createQuery("FROM " + classe.getSimpleName()).getResultList();
    }

    public T buscaPorId(Long id) {
        EntityManager em = new JPAUtil().getEntityManager();
        T instancia = em.find(classe, id);
        em.close();
        return instancia;
    }

    public List<T> listaPorId(Long parametro) {
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createQuery("FROM " + classe.getSimpleName() + " WHERE tipo.id = :id");
        q.setParameter("id", parametro);
        return q.getResultList();
    }

    public List<T> listNome(String nome) {
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createQuery("FROM " + classe.getSimpleName() + " WHERE nome LIKE '%" + nome + "%'");
        return q.getResultList();
    }

    public List<T> listFila(String condicao) {
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createQuery("FROM cliente inner join instalacao \n"
                + "on instalacao.id = cliente.instalacao_id and instalacao.situação LIKE '%" + condicao + "%'");
        return q.getResultList();
    }

    public void update(T entity) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        em.merge(entity);
        em.flush();
        em.getTransaction().commit();
        em.close();
    }

    public void Metodo() {
    }

}
