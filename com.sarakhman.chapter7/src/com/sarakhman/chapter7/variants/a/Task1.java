package com.sarakhman.chapter7.variants.a;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public void run() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter index of letter: ");
		int k = in.nextInt();
		System.out.println("Your k = " + k);
		System.out.print("Enter replacement character: ");
		char repl =	(char)System.in.read();
		System.out.println("Your repl = " + repl);
		System.out.print("Enter your text: ");
		String str = in.next();
		str += in.nextLine();
		System.out.println("Your string = " + str);
		String[] strArr = str.split(" ");
		StringBuilder[] sbArr = new StringBuilder[strArr.length];
		for(int i = 0; i < sbArr.length; i++) {
			sbArr[i] = new StringBuilder(strArr[i]);
		}
		for(StringBuilder sb : sbArr) {
			if(k < sb.length()) {
				sb.setCharAt(k, repl);
			}
		}
		System.out.print("Your edited text: ");
		for(StringBuilder sb : sbArr)
			System.out.print(sb + " ");
		in.close();
	}
}
