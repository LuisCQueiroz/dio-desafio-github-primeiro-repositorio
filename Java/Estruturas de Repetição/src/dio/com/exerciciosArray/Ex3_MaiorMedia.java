package dio.com.exerciciosArray;
/*
    Faça um programa que leia 5 números
    Informe o número maior e
    mostre a média entre eles
 */

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int contador = 0;
        int soma = 0;
        int maior = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
                if (numero >maior)maior = numero;

            contador = contador +1;
            soma = soma + numero;
        }while(contador < 5);

        System.out.println("A soma dos números foi " + soma);
        System.out.println("A média dos números foi " + (soma/5));
        System.out.println("O maior número digitado foi " + maior);


    }
}
