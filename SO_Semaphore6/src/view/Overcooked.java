package view;

import java.util.concurrent.Semaphore;

import controller.ThreadPrato;

public class Overcooked {

	public static void main(String[] args) {

		Semaphore entrega = new Semaphore(1);

		for (int idThread = 1; idThread < 6; idThread++) {
			ThreadPrato t = new ThreadPrato(idThread, entrega);
			t.start();
		}
	}
}
