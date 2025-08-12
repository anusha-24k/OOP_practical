package week3;
import java.util.Scanner;
public class DisplayName {
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your name");
	    String name=sc.nextLine();
	    for (int i=0 ;i < name.length();i++) {
	      System.out.println(name.charAt(i));
	    }
	    sc.close();

	  }

	}

