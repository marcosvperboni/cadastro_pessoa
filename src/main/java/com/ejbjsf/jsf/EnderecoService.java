package com.ejbjsf.jsf;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Named("enderecoService")
@RequestScoped
@Stateless
public class EnderecoService { 
    
        @PersistenceContext
        private EntityManager entityManager;
    
        public void adicionarEndereco(Endereco endereco) {
            entityManager.persist(endereco);
        }
    
        public void atualizarEndereco(Endereco endereco) {
            entityManager.merge(endereco);
        }
    
        public void excluirEndereco(int idEndereco) {
            Pessoa endereco = entityManager.find(Pessoa.class, idEndereco);
            if (endereco != null) {
                entityManager.remove(endereco);
            }
        }
    
        public Pessoa recuperarEndereco(int idEndereco) {
            return entityManager.find(Pessoa.class, idEndereco);
        }
    
        public List<Endereco> recuperarTodosEndereco() {
            TypedQuery<Endereco> query = entityManager.createQuery("SELECT c FROM Endereco c", Endereco.class);
            return query.getResultList();
        }
    }
    
