package practice.java.string;

import java.util.Scanner;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {
		if (a.length() == b.length()) {

			char[] charArrayA = a.toLowerCase().toCharArray();
			char[] charArrayB = b.toLowerCase().toCharArray();
			java.util.Arrays.sort(charArrayB);
			java.util.Arrays.sort(charArrayA);
			a = java.util.Arrays.toString(charArrayA);
			b = java.util.Arrays.toString(charArrayB);
			if (a.equals(b))
				return true;
			else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
