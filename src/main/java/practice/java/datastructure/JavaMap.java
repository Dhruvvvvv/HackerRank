package practice.java.datastructure;

import java.util.HashMap;
import java.util.Map;
//Complete this code or write your own from scratch
import java.util.Scanner;

public class JavaMap {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			Integer integer = map.get(s);
			if (integer == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + integer);
			}
		}
	}
}

