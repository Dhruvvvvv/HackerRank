package practice.java.introduct;

import java.util.Scanner;

public class BreathAndHeigth {

//Write your code here
	public static int B;
	public static int H;
	static boolean flag;
	static {
		Scanner sc = new Scanner(System.in);
		flag = false;
		B = sc.nextInt();
		H = sc.nextInt();
		if (B >= 0 && H >= 0) {
			flag = true;
		} else {
			flag = false;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
