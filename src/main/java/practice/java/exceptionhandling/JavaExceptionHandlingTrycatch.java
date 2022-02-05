package practice.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTrycatch {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x / y);
		} catch (InputMismatchException e) {

			System.out.println(e.getClass().getName());

		}
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
