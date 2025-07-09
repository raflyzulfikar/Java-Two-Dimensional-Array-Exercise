//RAFLY ZULFIKAR ALKAUTSAR
//102022400192
//SI-48-08
//ARRAY 2 DIMENSI

import java.util.Random;
public class Latihan3 {
    public static void main (String[] args) {
        Random random = new Random();
        int rows = 3;
        int cols = 3;
        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
            }
        }
        System.out.println("Matriks");
        int totalSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
                totalSum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("\nJumlah semua elemen: " + totalSum);
    }

}
