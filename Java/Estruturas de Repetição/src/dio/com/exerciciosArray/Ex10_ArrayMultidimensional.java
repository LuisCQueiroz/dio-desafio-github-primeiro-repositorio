package dio.com.exerciciosArray;

import java.util.Random;
import java.util.Scanner;

/*
    Gere e imprima uma matriz M 4x4 com valores aleatorios entre 0 e 9
 */
public class Ex10_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] m = new int [4][4];

        for(int i =0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(9);
            }
        }
        System.out.println(" Matriz : ");
        for ( int[] linha: m ) {
            for (int coluna: linha ) {
                System.out.print(coluna + " ");

            }
            System.out.println();
        }

    }
}
