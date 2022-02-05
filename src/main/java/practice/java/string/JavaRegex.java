package practice.java.string;

import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));

			
		}

	}

}

class MyRegex {
	public static String pattern;
	private static String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

	public MyRegex() {
		this.pattern = match;
	}
	
	public static final String match = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

}
