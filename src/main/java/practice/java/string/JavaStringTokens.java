package practice.java.string;

import java.util.Scanner;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();
		if (s.length() >= 1 && s.length() <= 4 * (int) Math.pow(10, 5)) {
			String[] str = s.split("[?, '!]+");
			System.out.println(str.length);
			for (String string : str) {
				System.out.println(string);
			}
		}
		scan.close();
	}
}
