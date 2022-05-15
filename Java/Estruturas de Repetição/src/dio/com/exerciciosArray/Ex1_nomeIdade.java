package dio.com.exerciciosArray;

/*
    Exercício 1 - Nome e idade:
    Faça um programa que leia dois valores:
    O primeiro representando nome do aluno
    O segundo representando a idade do aluno
    Pare se inserir o valor 0 no nome

 */

import java.util.Scanner;

public class Ex1_nomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
                if (nome.equals("0")) break;
            System.out.println("idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Fim execução...");







        }
    }


