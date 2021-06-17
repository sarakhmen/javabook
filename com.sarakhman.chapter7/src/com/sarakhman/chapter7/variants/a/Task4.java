package com.sarakhman.chapter7.variants.a;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
	public static void run(String str, String subStr, int k) throws InputMismatchException {
		System.out.println("\n\nTask4:");
		Scanner in = new Scanner(System.in);
		str = str.substring(0, k) + subStr + str.substring(k);
		System.out.println("Edited text (with specified substring): " + str);
	}
}
