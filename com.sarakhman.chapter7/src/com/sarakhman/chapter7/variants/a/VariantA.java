package com.sarakhman.chapter7.variants.a;

import java.io.IOException;

public class VariantA {
	public void run() {
		Task1 t1 = new Task1();
		try {
			t1.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
