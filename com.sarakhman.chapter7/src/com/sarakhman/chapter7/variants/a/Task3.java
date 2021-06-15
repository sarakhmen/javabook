package com.sarakhman.chapter7.variants.a;

public class Task3 {
	public static void run(String str) {
		System.out.println("\n\nTask3:");
		StringBuilder sb = new StringBuilder(str);
		int prevPos = -1;
		for(int i = 1; i < sb.length(); i++) {
			if(Character.toLowerCase(sb.charAt(i)) == 'a' 
					&& Character.toLowerCase(sb.charAt(i-1)) == 'p') {
				if(prevPos != -1) {
					if(sb.charAt(prevPos) == 'A')
						sb.setCharAt(prevPos, 'O');
					else
						sb.setCharAt(prevPos, 'o');
				}
				prevPos = i;
			}
		}
		
		System.out.println("Changed letters: " + sb);
	}
}
