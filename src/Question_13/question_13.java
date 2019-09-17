package Question_13;

import java.util.Scanner;
import java.util.Random;

public class question_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of lines: ");
        int lines = scanner.nextInt();
        System.out.print("Enter the size of columns: ");
        int columns = scanner.nextInt();
        int x = 0;
        int[][] a = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sorting rows in a matrix in ascending order: ");
        for (int y = 0; y < lines; y++) {
            for (int i = 0; i < lines-1; i++) {
                for (int j = 0; j < columns; j++) {
                    if (a[i][j] > a[i+1][j]) {
                        x = a[i][j];
                        a[i][j] = a[i+1][j];
                        a[i+1][j] = x;
                    }
                }
            }
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sorting rows in a matrix in descending order: ");
        for (int y = 0; y < lines; y++) {
            for (int i = 0; i < lines-1; i++) {
                for (int j = 0; j < columns; j++) {
                    if (a[i][j] < a[i+1][j]) {
                        x = a[i][j];
                        a[i][j] = a[i+1][j];
                        a[i+1][j] = x;
                    }
                }
            }
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
