package view;

import controller.Ex1Thread;

public class Ex1Main {
	public static void main(String[] args) {
		for (int n = 0; n < 5; n++) {
			Thread t = new Ex1Thread();
			t.start();
		}
	}
}
