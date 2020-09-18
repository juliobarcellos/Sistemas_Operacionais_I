package view;

import controller.Ex2_Thread;

public class Main_Ex2 {
	public static void main(String[] args) {
		for (int n = 0; n < 5; n++) {
			Thread t = new Ex2_Thread();
			t.start();
		}
	}
}
