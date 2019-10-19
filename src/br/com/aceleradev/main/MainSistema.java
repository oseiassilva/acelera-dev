package br.com.aceleradev.main;

import java.time.LocalDate;
import java.time.Month;

import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Disciplina;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;
import br.com.aceleradev.repositories.UsuarioRepository;

public class MainSistema {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();

        Aluno aluno = new Aluno(
                "Gustavo ",
                "gustavo123",
                "123.456.789-23",
                LocalDate.of(1943, Month.AUGUST, 14));

        Aluno aluno2 = new Aluno(
                "Gustavo 2",
                "gustavo13",
                "123.456.789-23",
                LocalDate.of(1988, Month.APRIL, 02));

        Professor professor = new Professor(
                "Jose",
                "jose123",
                "123.456.789-23",
                LocalDate.of(1974, Month.MARCH, 27));

        usuarioRepository.insere(aluno);
        usuarioRepository.insere(aluno2);
        usuarioRepository.insere(professor);

        System.out.println("Professores:");
        usuarioRepository.mostraProfessores();

        System.out.println("Alunos:");
        usuarioRepository.mostraAlunos();
        
        System.out.println("Média de idade dos alunos: "+usuarioRepository.mediaIdadeAlunos());

//        Disciplina disciplina = new Disciplina("Matematica", professor);
//        disciplina.matricular(aluno);

//        System.out.println(disciplina);
//        disciplina.mostraAlunos();


    }

}
