package dio.com.exerciciosArray;

import java.util.Scanner;

/*
    Desenvolva um gerador de tabuada
    capaz de gerar a tabuada de quanquer número interiro de 1 a 10
    o usuário deve informar de qual número ele deseja ver a tabuada.
    a saída deve ser conforme o exemplo abaixo:

    Tabuada de 5:
    5 x 1 = 5
    5 x 2 = 10
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada +":");
        for( int i = 1 ; i<=10 ; i++ ){
            System.out.println(tabuada + " x " + i + " = " + tabuada * i);
        }
    }

}
