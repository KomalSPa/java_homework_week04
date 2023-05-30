package java_homework_week04;

import java.util.Scanner;

public class Program_08_SymbolTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        symbolTriangle(scanner.nextInt());
        scanner.close();
    }

    public static void symbolTriangle(int k) {
        for (int i = 0; i <= k; i++) {
            for (int v = 0; v < i; v++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
