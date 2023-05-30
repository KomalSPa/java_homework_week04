package java_homework_week04;

import java.util.Scanner;
public class Program_06_NumberTriangle {
    public static void numTriangle(int komal) {
    for (int i = 0; i <= komal; i++) {
        for (int k = 0; k < i; k++) {
            System.out.print(k + 1);
        }
        System.out.println("");
    }
}
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        //calls static method
        numTriangle(scanner.nextInt());
        // closing the scanner object
        scanner.close();
    }
}
