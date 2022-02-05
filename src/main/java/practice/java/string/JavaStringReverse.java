package practice.java.string;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		if (A.length() <= 50) {
			String reverse = new StringBuffer(A).reverse().toString();
			if (reverse.equals(A)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
