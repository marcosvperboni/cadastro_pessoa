package com.ejbjsf.jsf;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("endereco")
@SessionScoped
public class Endereco {   
        private int id; 
        private String estado;
        private String cidade;
        private String logradouro;
        private int numero;
        private String cep;
        private Pessoa id_pessoa;

        public Endereco(int id, String cidade, String estado, String cep, String logradouro, int numero) {
            this.id = id;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
            this.logradouro = logradouro;
            this.numero = numero;
            this.cep = cep;
        }

        public int getId() {
            return id;
        }    

        public String getEstado() {
            return estado;
        }
    
        public void setEstado(String estado) {
            this.estado = estado;
        }
    
        public String getCidade() {
            return cidade;
        }
    
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
    
        public String getLogradouro() {
            return logradouro;
        }
    
        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }
        public int getNumero() {
            return numero;
        }
    
        public void setNumero(int numero) {
            this.numero = numero;
        }
        public String getCep() {
            return cep;
        }
    
        public void setCep(String cep) {
            this.cep = cep;
        }
        public Pessoa getId_pessoa() {
            return id_pessoa;
        }
    
        public void setId_pessoa(Pessoa id_pessoa) {
            this.id_pessoa = id_pessoa;
        }
    }
    
