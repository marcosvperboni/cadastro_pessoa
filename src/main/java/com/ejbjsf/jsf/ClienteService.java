package com.ejbjsf.jsf;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Named("clienteService")
@RequestScoped
@Stateless
public class ClienteService { 
    
        @PersistenceContext
        private EntityManager entityManager;
    
        public void adicionarPessoa(Pessoa pessoa) {
            entityManager.persist(pessoa);
        }
    
        public void atualizarPessoa(Pessoa pessoa) {
            entityManager.merge(pessoa);
        }
    
        public void excluirPessoa(int id_pessoa) {
            Pessoa pessoa = entityManager.find(Pessoa.class, id_pessoa);
            if (pessoa != null) {
                entityManager.remove(pessoa);
            }
        }
    
        public Pessoa recuperarPessoa(int id_pessoa) {
            return entityManager.find(Pessoa.class, id_pessoa);
        }
    
        public List<Pessoa> recuperarTodosPessoa() {
            TypedQuery<Pessoa> query = entityManager.createQuery("SELECT c FROM Pessoa c", Pessoa.class);
            return query.getResultList();
        }
    }
    
