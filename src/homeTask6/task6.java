package homeTask6;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		float year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		year = input.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) 
			System.out.println("Number of days - 366");
		 else
			System.out.println("Number of days - 365");

	}

}
