package practice.java.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String n = bufferedReader.readLine();
		BigInteger b = new BigInteger(n);
		boolean probablePrime = b.isProbablePrime(100);
		if (probablePrime) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

		bufferedReader.close();
	}
}
