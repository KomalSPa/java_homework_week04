package java_homework_week04;
import java.util.Scanner;
public class Program_15_LeftTriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int a = scanner.nextInt();
        leftTriangle(a);
        scanner.close();
    }
    public static void leftTriangle(int x) {
        int i, k;
        for (i = 1; i <= x; i++){
        for (k = 1; k <= i; k++) {
            System.out.print("*");
                    }
            System.out.print("\n");
    }
    }}

