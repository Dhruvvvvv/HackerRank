package practice.java.introduct;
import java.util.Scanner;

public class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int sum = 0;
			for (int j = 0; j <= n - 1; j++) {
				//System.out.print(a + (int) Math.pow(2, j) * b);
				System.out.println("Sum :"+sum);
				sum = sum +(int) Math.pow(2, j) * b;
				System.out.println("a + (int) Math.pow(2, j) * b::=> "+(a + (int) Math.pow(2, j) * b));
				System.out.print(" ");
			}
			System.out.println();

		}
		in.close();
	}
}