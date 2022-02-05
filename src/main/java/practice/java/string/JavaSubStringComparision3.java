package practice.java.string;

import java.util.Scanner;

public class JavaSubStringComparision3 {

	public static String getSmallestAndLargest(String s, int k) {
		String currstr = s.substring(0, k);
		String smallest = currstr;
		String largest = currstr;
		for (int i = k; i < s.length(); i++) {
			currstr = currstr.substring(1, k) + s.charAt(i);
			if (largest.compareTo(currstr) < 0) {
				largest = currstr;
			}
			if (smallest.compareTo(currstr) > 0) {
				smallest = currstr;
			}
		}
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
