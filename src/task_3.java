import java.util.Scanner;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Введіть розмірність матриці (n <= 15): ");
        
        do{
            n = scanner.nextInt();

            if(n > 0 && n <= 15) {
                break;
            }else {
                System.out.print("Хибне значення, повторіть спробу! Введіть розмірність матриці: ");
            }
        }while(true);

        int[][] X = new int[n][n];
        int[] Y = new int[n];

        fillMatrixRandom(X);

        fillVector(X, Y);

        System.out.println("Матриця \'X\':");
        for(int i = 0; i < X.length; i++) {
            for(int f = 0; f < X.length; f++) {
                System.out.print(X[f][i] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Вектор \'Y\':");
        for(int element : Y) {
            System.out.print(element + " ");
        }
        scanner.nextLine();

    }

    public static void fillMatrixRandom(int[][] matrix) {
        Random random = new Random();

        for(int i = 0; i < matrix.length; i++) {
            for(int f = 0;f < matrix.length; f++) {
                matrix[i][f] = random.nextInt(100) - 10;
            }
        }
    }
    public static void fillVector(int[][] matrix, int[] vector) {    
        for(int i = 0; i < matrix.length; i++) {
            int sum = 0;
            boolean isNegativeValue = false;

            for(int f = 0; f < matrix.length; f++) {
                if(matrix[i][f] < 0) {
                    isNegativeValue = true;
                }

                if(isNegativeValue) {
                    sum += matrix[i][f];
                }
            }
            vector[i] = isNegativeValue ? sum : -1;
        }
    }
}