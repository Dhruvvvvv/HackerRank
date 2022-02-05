package practice.java.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < Q; i++) {
			int element = sc.nextInt();
			list.add(element);
		}

		int o = sc.nextInt();
		for (int j = 0; j < o; j++) {
			String s = sc.next();
			if ("Insert".equals(s)) {
				int index = sc.nextInt();
				int value = sc.nextInt();
				list.add(index, value);
			} else {
				int index = sc.nextInt();
				list.remove(index);
			}

		}

		for (Integer i : list) {
			System.out.print(i + " ");
		}

	}
}