package br.com.aceleradev.main;

import java.time.LocalDate;
import java.time.Month;

import br.com.aceleradev.domain.Aluno;

public class Main {

    public static void main(String[] args) {

//        try {
//            aluno = new Aluno(
//                    "Gustavo",
//                    "gus",
//                    "123.456.789-12");
//        } catch (Exception e ) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally");
//        }


        Aluno aluno = new Aluno(
                "Gustavo",
                "gus",
                "123.456.789-12",
                LocalDate.of(1990, Month.DECEMBER, 31));;

//        System.out.println(aluno);

    }

}
