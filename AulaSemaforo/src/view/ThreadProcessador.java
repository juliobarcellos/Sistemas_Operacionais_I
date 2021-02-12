package view;

import java.util.concurrent.Semaphore;

public class ThreadProcessador {

	private static Semaphore semaforo;

	public static void main(String[] args) {
		int numeroPermissoes = 1;
		semaforo = new Semaphore(numeroPermissoes);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	private static void processar(int idThread) {
		try {
			System.out.println("Thread #" + idThread + " processando");
			int TempoDormir = (int) (Math.random() * 10000);
			Thread.sleep(TempoDormir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void entrarRegiaoNaoCritica(int idThread) {
		System.out.println("Thread #" + idThread + " em região não crítica");
		processar(idThread);
	}

	private static void entrarRegiaoCritica(int idThread) {
		System.out.println("Thread #" + idThread + " entrando em região crítica");
		processar(idThread);
		System.out.println("Thread #" + idThread + " saindo da região crítica");
	}

	public static void processamento(int idThread) {
		entrarRegiaoNaoCritica(idThread);
		try {
			semaforo.acquire();
			entrarRegiaoCritica(idThread);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}

	static Thread t1 = new Thread() {
		public void run() {
			processamento(1);
		}
	};

	static Thread t2 = new Thread() {
		public void run() {
			processamento(2);
		}
	};

	static Thread t3 = new Thread() {
		public void run() {
			processamento(3);
		}
	};

	static Thread t4 = new Thread() {
		public void run() {
			processamento(4);
		}
	};
}
