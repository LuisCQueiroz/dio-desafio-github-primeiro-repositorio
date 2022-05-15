package dio.com.exerciciosArray;

import java.util.Scanner;

/*
    Faç um programa que leia um vetor de seis caracteres
    e diga quantas consoantes foram lidas
    Imprima as consoantes.
    */
public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do{
            System.out.println("Digite uma letra: ");
                String letra = scan.next();

                if ( !(letra.equalsIgnoreCase("a")|
                   letra.equalsIgnoreCase("e")|
                   letra.equalsIgnoreCase("i")|
                   letra.equalsIgnoreCase("o")|
                   letra.equalsIgnoreCase("u"))){
                    consoantes[count] = letra;
                    quantConsoantes++;
                }
                count++;
        }while(count < consoantes.length);

        System.out.print("\nConsoantes: ");
        for (String consoante: consoantes) {
            if(consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + quantConsoantes);
    }
}
