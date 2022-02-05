package practice.java.datastructure;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaStack {

	public static boolean isValid(String str, Map map) {

		if(str.length()%2!=0) {
			return false;
		}
		ArrayDeque<Character> ad = new ArrayDeque<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if(map.containsKey(ch)) {
				ad.push(ch);
			}else if(ad.isEmpty() || ch !=map.get(ad.pop())) {
				return false;
			}
		}
		return ad.isEmpty();
	}

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Character> map = new HashMap<>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			System.out.println(isValid(input, map) ? "true" : "false");

		}
	}
}

