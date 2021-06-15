package com.sarakhman.chapter7.variants.a;
import java.util.Formatter;

public class Task2 {
	public static void run(String str) {
		System.out.println("\n\nTask2:");
		Formatter fm = new Formatter();
		for(int i = 0; i < str.length(); i++)
			fm.format("%-3d", (int)str.charAt(i));
		System.out.println("Original text with its characters' symbols:");
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + "  ");
		}
		System.out.println("\n" + fm);
	}
}
