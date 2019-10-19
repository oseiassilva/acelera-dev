package br.com.aceleradev.domain;

import br.com.aceleradev.exceptions.LoginInvalidoException;

import static br.com.aceleradev.utils.MensagemException.LOGIN_MENOR_DE_TRES_CARACTERES;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String login;
    private String cpf;
    private LocalDate nascimento;

    public Usuario(String nome, String login, String cpf, LocalDate nascimento) {
        this.nome = nome;
        setLogin(login);
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(loginInvalido(login)){
            throw new LoginInvalidoException(LOGIN_MENOR_DE_TRES_CARACTERES);
        }

        this.login = login;

    }

    private boolean loginInvalido(String login) {
        return login.length() <= 3;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome
                + "\nlogin: " + this.login
                + "\ncpf: " + this.cpf
                + "\ndata nascimento: " + this.nascimento + "\n";
    }
    
}
