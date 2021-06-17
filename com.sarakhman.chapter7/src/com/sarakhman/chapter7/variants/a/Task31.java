package com.sarakhman.chapter7.variants.a;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task31 {
	public static void run(String text) {
		System.out.println("\n\nTask31:");
		Matcher m = Pattern.compile("\\b[A-Z]\\p{Alpha}*\\b").matcher(text);
		int counter = 0;
		while(m.find()) {
			counter++;
		}
		System.out.println("There are " + counter + " occurrences of words "
				+ "starting with an Uppercase letter in this text");
	}
}
