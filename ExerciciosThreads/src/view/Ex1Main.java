package view;

import controller.Ex1Thread;

public class Ex1Main {
	public static void main(String[] args) {
		for(int n=1;n<6;n++) {
			Thread t = new Ex1Thread(n);
			t.start();
		}
	}
}
