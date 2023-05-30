package java_homework_week04;

import java.util.Scanner;

public class Program_09_FibonacciNumber {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Fibonacci number count: ");
        isFibonacci(scanner.nextInt());
        scanner.close();
    }
public static void isFibonacci(int count) {
        int k1 = 0, k2 = 1, k3;
    System.out.println(k1 + " " + k2);
    for (int i = 2; i < count; ++i) {
        k3 = k1 + k2;
        System.out.println(" " + k3);
        k1 = k2;
        k2 = k3;
    }
}
}
