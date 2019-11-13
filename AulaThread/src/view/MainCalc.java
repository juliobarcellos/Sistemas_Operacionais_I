package view;

import controller.ThreadCalc;

public class MainCalc {

	public static void main(String[] args) {
		int a=10, b=2;
		
		for (int op=0; op<4; op++) {
			//ThreadCalc thread = new ThreadCalc (a, b, op);
			Thread t = new ThreadCalc(a, b, op);
			t.start();
		}
	}
}
