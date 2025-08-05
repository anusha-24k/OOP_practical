package week2;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt(); 
        int[] a = new int[n];

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();    
        }

        int min = a[0];
        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }

        for (int i = 1; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        sc.close();    
    }
}
