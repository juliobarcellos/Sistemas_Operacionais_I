package view;

import controller.ThreadBuffer;

public class MainBuffer {

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			Thread t = new ThreadBuffer(i);
			t.start();
		}
	}
}
