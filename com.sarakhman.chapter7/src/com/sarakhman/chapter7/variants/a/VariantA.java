package com.sarakhman.chapter7.variants.a;
import java.util.Scanner;
import java.io.IOException;

public class VariantA {
	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String str = in.next();
		str += in.nextLine();
		System.out.print("Enter substring: ");
		String subStr = in.next();
		subStr += in.nextLine();
		System.out.print("Enter word: ");
		String word = in.next();
		System.out.print("Enter index of letter (k - position): ");
		
		int k = in.nextInt();
		System.out.println("k = " + k);
		try {
//			Task1.run(str, k);
//			Task2.run(str);
//			Task3.run(str);
//			Task4.run(str, subStr, k);
//			Task5.run(str, subStr, word);
//			Task10.run(str);
			Task31.run(str);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception catched!!");
			e.printStackTrace();
		} finally{
			in.close();
		}
	}
}
