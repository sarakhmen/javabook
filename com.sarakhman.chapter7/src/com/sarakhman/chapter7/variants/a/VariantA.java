package com.sarakhman.chapter7.variants.a;
import java.util.Scanner;
import java.io.IOException;

public class VariantA {
	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String str = in.next();
		str += in.nextLine();
		try {
			Task1.run(str);
			Task2.run(str);
			Task3.run(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			in.close();
		}
	}
}
