package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread {

	private int idCarro;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;

	public ThreadCarro(int idCarro, Semaphore semaforo) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		CarroAndando();
		try {
			semaforo.acquire();
			CarroParado();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
		CarroSaindo();
	}

	// Faz o carro se locomover até chegar ao estacionamento e anota sua posição de
	// chegada
	private void CarroAndando() {
		int distanciaFinal = 1000;
		int variacaoDistancia = (int) ((Math.random() * 101) + 100);
		int tempo = 500;
		int distanciaPercorrida = 0;

		while (distanciaPercorrida < distanciaFinal) {
			distanciaPercorrida += variacaoDistancia;
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("O carro " + idCarro + " já andou " + distanciaPercorrida + " metros");
		}
		posChegada++;
		System.out.println("O carro " + idCarro + " foi o " + posChegada + "º a chegar");
	}

	// Após pegar o semáforo, o carro estaciona e fica parado por um tempo aleatório
	private void CarroParado() {
		System.out.println("O carro " + idCarro + " estacionou");
		int tempoParado = (int) ((Math.random() * 510) + 500);
		try {
			Thread.sleep(tempoParado);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// atualiza e mostra a posição que o carro saiu do estacionamento
	private void CarroSaindo() {
		posSaida++;
		System.out.println("O carro " + idCarro + " foi o " + posSaida + " o. a sair");
	}
}
