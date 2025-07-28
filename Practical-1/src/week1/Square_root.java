package week1;

import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Square roots for: " + i);
			double squareRoot = Math.sqrt(i);
			System.out.println("Square roots are: " + squareRoot);
		}
		sc.close();
	}
}

