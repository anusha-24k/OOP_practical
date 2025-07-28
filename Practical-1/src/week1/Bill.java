package week1;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		double bill,discount;
		double gst=0.05;
		double maintenance=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill");
		bill= sc.nextDouble();
		if(bill>=1000) {
			discount= (bill*0.1);
			bill=bill-discount;
			gst=gst*bill;
			bill=gst+bill+maintenance;
			System.out.println("GST is: " + gst);
			System.out.println("Maintenance chargers is: " + maintenance);
			System.out.println("Total bill is: " + bill);
		}else {
			discount= (bill*0.05);
			bill=bill-discount;
			gst=gst*bill;
			bill=gst+bill+maintenance;
			System.out.println("GST is: " + gst);
			System.out.println("Maintenance chargers is: " + maintenance);
			System.out.println("Total bill is: " + bill);
		}
		sc.close();
	}

}


