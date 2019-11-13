package view;

import controller.ThreadBuffer;

public class PrincipalBuffer {

	public static void main(String[] args) {
		
		for (int op=0; op<2; op++) {
			Thread t = new ThreadBuffer();
			t.start();
		}
	}
}
