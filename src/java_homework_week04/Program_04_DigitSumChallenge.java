package java_homework_week04;

import java.util.Scanner;
public class Program_04_DigitSumChallenge {
 public static void main(String[] args) {


 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter number:");
 int result = sumDigits(scanner.nextInt());
 System.out.println("Sum of digits = "+ result);
 scanner.close();
}
 public static int sumDigits(int number) {
  if (number < 10) {
   return -1;
  }
   int digit;
   int sum = 0;
   while (number > 0) {
    digit = number % 10;
    sum = sum + digit;
    number = number / 10;

   }
   return sum;
  }}



