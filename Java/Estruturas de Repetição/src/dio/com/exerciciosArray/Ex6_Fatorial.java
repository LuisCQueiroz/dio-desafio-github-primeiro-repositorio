package dio.com.exerciciosArray;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/*
    Faça um programa que calcule o fatorial de número inteiro fornecido pelo usuário.
    Ex.: 5!=120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Número: ");
        int numero = scan.nextInt();
        int fatorial = 1;
        for(int i = numero ; i>0 ;i--) {
            fatorial = fatorial * i;
         }
        System.out.println(numero + "! = " + fatorial);
    }

}
