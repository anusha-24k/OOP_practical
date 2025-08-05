package week2;
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("User input string is: " + str);
        System.out.println("Character at position 2: " + str.charAt(2));
        System.out.println("User input in uppercase is: " + str.toUpperCase());
        System.out.println("User input in lowercase is: " + str.toLowerCase());
        System.out.println("User input contains 'java': " + str.contains("java"));
        System.out.println("User input with 'a' replaced by '@': " + str.replace('a', '@'));
        System.out.println("User input length is: " + str.length());
        System.out.println("User input substring (0 to 2): " + str.substring(0, 2));

        sc.close();
    }
}
