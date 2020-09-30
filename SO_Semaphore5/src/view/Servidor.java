package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCalculo;

public class Servidor {
	
	public static void main(String[] args) {
		Semaphore semaforoBD = new Semaphore(1);
		
		for (int idThread = 1; idThread < 22; idThread++) {
			ThreadCalculo t = new ThreadCalculo(idThread, semaforoBD);
			t.start();
		}
	}
}
