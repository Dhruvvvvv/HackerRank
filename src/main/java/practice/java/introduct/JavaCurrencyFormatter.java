package practice.java.introduct;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		NumberFormat usCurrencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat franceCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String us = usCurrencyInstance.format(payment);
		String china = chinaCurrency.format(payment);
		String france = franceCurrency.format(payment);
		String india = indiaCurrency.format(payment);
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}