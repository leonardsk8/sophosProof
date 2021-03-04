package sophos.prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sophos {

    private static String[][] matriz;
    private static int matrixSize;

    public static void main(String[] args) {
        getNumberByUser();

        fillMatrixDash();

        fillXMainDiagonal();

        fillXInvertedDiagonal();

        printMatrix();
    }

    private static void getNumberByUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the size? ");

        try {
            matrixSize = scanner.nextInt();
            if (matrixSize == 0) {
                System.out.print("ERROR!");
                System.exit(0);
            }
        }catch (InputMismatchException e){
            System.out.print("ERROR!");
            System.exit(0);
        }
    }

    private static void fillMatrixDash() {
        matriz = new String[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matriz[i][j] = "_";
            }
        }
    }

    private static void fillXMainDiagonal() {
        for (int i = 0; i < matrixSize; i++) {
            matriz[i][i] = "X";
        }
    }

    private static void fillXInvertedDiagonal() {
        int j=0;
        for (int i = matrixSize - 1; i >= 0; i--) {
            matriz[i][j] = "X";
            j++;
        }
    }

    private static void printMatrix() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
