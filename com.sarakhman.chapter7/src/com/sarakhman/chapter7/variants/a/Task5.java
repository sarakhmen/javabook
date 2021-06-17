package com.sarakhman.chapter7.variants.a;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task5 {
	public static void run(String str, String subStr, String word) {
		System.out.println("\n\nTask5:");
		if(Pattern.matches(".*" + subStr, str)) {
			System.out.println("The text ends with specified substring!");
			Pattern p = Pattern.compile("\\b\\w+\\b");
			Matcher m = p.matcher(str);
			StringBuffer strBuf = new StringBuffer("");
			while(m.find()) {
				m.appendReplacement(strBuf, "$0 " + word);
			}
			System.out.println("Edited text: " + strBuf);
		}
		else {
			System.out.println("The text doesn't end with specified substring!!");
		}
			
	}
}
