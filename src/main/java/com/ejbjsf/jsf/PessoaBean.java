package com.ejbjsf.jsf;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaBean {

    @PersistenceContext
    private EntityManager entityManager;

    public void adicionarCliente(Pessoa Pessoa) {
        entityManager.persist(Pessoa);
    }

    public void atualizarCliente(Pessoa Pessoa) {
        entityManager.merge(Pessoa);
    }

    public void excluirCliente(int id) {
        Pessoa id_pessoa = entityManager.find(Pessoa.class, id);
        if (id_pessoa != null) {
            entityManager.remove(id_pessoa);
        }
    }

    public Pessoa obterClientePorId(int id) {
        return entityManager.find(Pessoa.class, id);
    }

    public List<Pessoa> obterTodosClientes() {
        return entityManager.createQuery("SELECT c FROM Pessoa c", Pessoa.class).getResultList();
    }
}
