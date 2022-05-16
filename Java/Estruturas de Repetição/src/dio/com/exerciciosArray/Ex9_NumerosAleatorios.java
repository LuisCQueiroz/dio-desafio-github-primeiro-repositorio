package dio.com.exerciciosArray;

import java.util.Random;
import java.util.Scanner;


/*
    Faça um programa que leia 20 numeros inteiros entre 0 e 100
    e armazene em um vetor.
    Ao final mostre seus numeros e seus sucessores.
    */
public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Random random = new Random();

            int[] numerosAleatorios = new int[20];
                for (int i = 0 ; i < numerosAleatorios.length ;i++ ) {
                    int numero = random.nextInt(100);
                    numerosAleatorios[i] = numero;
                    }
        System.out.print("Numeros aleatórios: ");
        for ( int numero: numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nAntecessores dos Numeros aleatórios: ");
        for ( int numero: numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
        System.out.print("\nSucessores dos Numeros aleatórios: ");
        for ( int numero: numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
            }



}
