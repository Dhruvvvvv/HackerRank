package practice.java.advance;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hashByte = md.digest(str.getBytes(StandardCharsets.UTF_8));
		StringBuilder sb = new StringBuilder();
		for (byte b : hashByte) {
			sb.append(String.format("%02x", b));
		}
		System.out.println(sb.toString());

	}

}
