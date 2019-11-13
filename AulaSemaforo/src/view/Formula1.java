package view;

import java.util.concurrent.Semaphore;
import controller.ThreadFormula;

public class Formula1 {

	public static void main(String[] args) {
		int largadaCarros = 5;
		int carrosEscuderia = 1;
		Semaphore semaforoLargada = new Semaphore(largadaCarros);
		Semaphore semaforoEscuderia = new Semaphore(carrosEscuderia);
		
		for (int idCarro = 1; idCarro <15; idCarro++) {
			Thread carro = new ThreadFormula(idCarro, semaforoLargada, semaforoEscuderia);
			carro.start();
		}
	}

}
