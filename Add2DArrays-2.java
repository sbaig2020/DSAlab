import java.util.Scanner;

public class Add2DArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the 2D arrays (3x3)
        int rows = 3;
        int cols = 3;

        // Create two 3x3 2D arrays
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] sumArray = new int[rows][cols];

        // Input elements for the first array
        System.out.println("Enter elements for the first 3x3 array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second array
        System.out.println("Enter elements for the second 3x3 array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        // Add the two arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Display the sum of the two arrays
        System.out.println("The sum of the two 3x3 arrays is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}
