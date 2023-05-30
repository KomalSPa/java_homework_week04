package java_homework_week04;
import java.util.Scanner;

public class Program_07_FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = scanner.nextInt();
        System.out.println("The sum of first & last digit is: " + sumFirstAndLastDigit(a));
        scanner.close();
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int d, rev = 0, vp, kp, s;
        kp = number % 10;
        while (number > 0) {
            d = number % 10;
            rev = rev * 10 + d;
            number = number / 10;
        }
        vp = rev % 10;
        s = vp + kp;
        return s;
    }
}
