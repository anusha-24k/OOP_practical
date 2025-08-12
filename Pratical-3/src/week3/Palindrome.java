package week3;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string");
	    String str=sc.nextLine();
	    StringBuilder sb=new StringBuilder(str);
	    StringBuilder sa=new StringBuilder(str);
	      sb.reverse();
	      int x;
	      x=sb.compareTo(sa);
	      if(x==0) {
	        System.out.println("String is palindrome");
	      }
	      else {
	        System.out.println("String is not a palindrome");
	      }
	    
	sc.close();
	  }

	}

