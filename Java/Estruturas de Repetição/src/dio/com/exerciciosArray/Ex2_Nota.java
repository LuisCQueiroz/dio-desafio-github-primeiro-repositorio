package dio.com.exerciciosArray;

import java.util.Scanner;

/*
    Faça um programa que peça uma nota entre 0 e 10
    Mostre uma mensagem caso o valor seja inválido,
    e continue pedindo até que o valor seja válido.

 */
public class Ex2_Nota {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Informe uma nota entre 0 e 10: ");
        nota = scan.nextInt();
            while(nota <0 | nota >10) {
                System.out.println("Nota Inválida!!! Digite Novamente: ");
                    nota = scan.nextInt();

            }
        System.out.println("Parabéns, você digitou uma nota válida.\nFim de excecução.");

             }
}
