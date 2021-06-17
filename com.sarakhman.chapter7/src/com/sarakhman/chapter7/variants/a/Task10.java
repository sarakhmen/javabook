package com.sarakhman.chapter7.variants.a;
import java.util.Arrays;

public class Task10 {
	public static void run(String text) {
		System.out.println("\n\nTask6:");
		if(text.isEmpty()) {
			System.out.println("Text is empty");
		}
		else {
			char[] arr = text.toCharArray();
			Arrays.sort(arr);
			char symbolCurr = '\0';
			char symbolPrev = '\0';
			int countCurr = 0;
			int countPrev = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != symbolCurr) {
					if(countCurr > countPrev) {
						countPrev = countCurr;
						symbolPrev = symbolCurr;
					}
					symbolCurr = arr[i];
					countCurr = 0;
				}
				countCurr++;
			}
			if(countCurr > countPrev)
				System.out.println("Most chars -> '" + symbolCurr + "' (occurs " + countCurr + " time(s))");
			else
				System.out.println("Most chars -> '" + symbolPrev + "' (occurs " + countPrev + " time(s))");
		}
	}
}
