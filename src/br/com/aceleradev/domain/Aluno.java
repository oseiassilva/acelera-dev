package br.com.aceleradev.domain;

import java.time.LocalDate;

public class Aluno extends Usuario{

    private Integer numeroMatricula;

    public Aluno(String nome, String login, String cpf, LocalDate nascimento) {
        super(nome, login, cpf, nascimento);
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

}
