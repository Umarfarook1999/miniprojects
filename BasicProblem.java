package miniProjects;

import java.util.Scanner;

public class BasicProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		double num = scan.nextDouble();
		
		
		System.out.println("Square of the entered number is " + Math.pow(num, 2));
		System.out.println("cube of the entered number is " + Math.pow(num, 3));
		System.out.println("quad of the entered number is " + Math.pow(num, 4));
		

	}

}
