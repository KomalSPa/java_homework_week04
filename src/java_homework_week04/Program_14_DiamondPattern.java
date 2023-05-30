package java_homework_week04;

import java.util.Scanner;

public class Program_14_DiamondPattern {
    public static void main(String [] args) {
        Scanner k1 = new Scanner(System.in);
        System.out.println("Enter the Number of row : ");
        int a = k1.nextInt();
        System.out.println("Enter the symbol : ");
        char c = k1.next().charAt(0);
        printDiamond(a, c);
        k1.close();
    }
    public static void printDiamond(int r, char ch) {
        int i = 1;
        int d;
        while (i<= r) {

            d = 1;
            while (d++ <= r-i) {
                System.out.print(" ");
            }
            d = 1;
while (d++ <= i * 2 - 1) {
    System.out.print(ch);
}
            System.out.println();
i++;
    }
        i = r - 1;
        while (i > 0) {
            d = 1;
            while (d++ <= r - i) {
                System.out.print(" ");

                            }
            d = 1;
            while (d++ <= i * 2 - 1) {
                System.out.print(ch);
                            }
            System.out.println();
            i--;
            }
        }
}
