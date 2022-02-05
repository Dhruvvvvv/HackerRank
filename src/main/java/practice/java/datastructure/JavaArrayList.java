package practice.java.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for (int row = 0; row < n; row++) {
			int d = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < d; j++) {
				list.add(sc.nextInt());
			}
			lists.add(list);
		}

		int q = sc.nextInt();
		for (int f = 0; f < q; f++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ArrayList<Integer> list = lists.get(x - 1);
			if (y <= list.size()) {
				System.out.println(list.get(y - 1));
			} else {
				System.out.println("ERROR!");
			}
		}
		sc.close();
	}
}