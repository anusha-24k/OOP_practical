package week3;
import java.util.Scanner;
public class NoOfVowels {
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string");
	    String str=sc.nextLine();
	    int count=0;
	    String vowels="aeiouAeiou";
	    for(int i=0;i<str.length();i++) {
	      char ch= str.charAt(i);
	      if(vowels.indexOf(ch)!=-1)
	      {
	        count++;
	      }
	    }
	    System.out.println("Number of vowels : "+ count);
	    sc.close();

	  }

	}

