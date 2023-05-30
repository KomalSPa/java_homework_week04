package java_homework_week04;
import com.sun.org.apache.bcel.internal.classfile.Constant;

import java.util.Scanner;
public class Program_03_FindVowelOrConsonant {

    public static boolean isItALetter(String k) {return k.charAt(0) > 96 && k.charAt(0) < 123; }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String str = scanner.next().toLowerCase();
        checkVewelOrConsonant(str);
        scanner.close();
    }
    public static void checkVewelOrConsonant(String letter) {
        //checks length of String
        //if user enters more than 1 character an error message is printed
        if (letter.length() > 1) {
            System.out.println("Error. Not a single character");
        } else if (!(isItALetter(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") ||
                letter.equals("u")) {
            System.out.println("Input letter is s vowel");
        } else {
            System.out.println("Input letter is a consonant");
}}}


