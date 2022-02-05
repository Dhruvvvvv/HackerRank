package practice.java.advance;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		if (str.length() >= 6 && str.length() <= 20) {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes(StandardCharsets.UTF_8));
			byte[] hashBytes = md.digest();
			for (byte b : hashBytes) {
				sb.append(String.format("%02x", b));
			}
		}
		System.out.println(sb.toString());
	}
}
