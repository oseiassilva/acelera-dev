package br.com.aceleradev.repositories;

import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public void insere(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void mostraProfessores() {
        usuarios.forEach(usuario -> {
            if(usuario instanceof Professor){
                System.out.println(usuario);
//                Professor professor = (Professor) usuario;
            }

        });
    }

    public void mostraAlunos() {
        usuarios.forEach(usuario -> {
            if(usuario instanceof Aluno){
                System.out.println(usuario);
            }
        });
    }
    
    public void mediaIdadeAlunos() {
    	List<Usuario> usuariosAlunos = usuarios.stream().filter(usuario -> (usuario instanceof Aluno)).collect(Collectors.toList());
    	List<Aluno> alunos = usuariosAlunos.stream().map(usuarioAluno -> (Aluno) usuarioAluno).collect(Collectors.toList());
    	List<LocalDate> datasNascimento = alunos.stream().map(aluno -> aluno.getNascimento()).collect(Collectors.toList()); 
    	List<Integer> idades = datasNascimento.stream().map(dataNascimento -> Period.between(dataNascimento, LocalDate.now()).getYears()).collect(Collectors.toList());
    	Integer soma = idades.stream().mapToInt(Integer::intValue).sum();
    	
    	System.out.println(soma/idades.size());    	
    }

}
