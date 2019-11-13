package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread{
	
	private int idCarro;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;
	
	
	public ThreadCarro (int idCarro, Semaphore semaforo) {
		this.idCarro=idCarro;
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
	
	private void CarroAndando() {
		int distanciaFinal = (int) ((Math.random()*1001)+1000);
		int variacaoDistancia = 100;
		int tempo = 100;
		int distanciaPercorrida = 0;
		
		while (distanciaPercorrida<distanciaFinal) {
			distanciaPercorrida += variacaoDistancia;
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("O carro "+idCarro+" já andou "+distanciaPercorrida+" metros");
		}
		posChegada++;
		System.out.println("O carro "+idCarro+" foi o "+posChegada+" a chegar");
	}
	
	private void CarroParado () {
		System.out.println("O carro "+idCarro+" estacionou");
		int tempoParado = (int) ((Math.random()*501)+500);
		try {
			Thread.sleep(tempoParado);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void CarroSaindo () {
		posSaida++;
		System.out.println("O carro "+idCarro+" foi o "+posSaida+" o. a sair");
	}
}
