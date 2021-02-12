package controller;

public class ThreadBuffer extends Thread {

	private int n;

	public ThreadBuffer(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		calc();
	}

	public void calc() {
		if (n == 1) {
			StringBuffer buffer = new StringBuffer();
			double tempoInicial = System.nanoTime();

			for (int i = 0; i < 32768; i++) {
				buffer.append("a");
			}

			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Em Buffer => " + tempoTotal + " segundos");
		} else {
			String texto = "";
			double tempoInicial = System.nanoTime();

			for (int i = 0; i < 32768; i++) {
				texto += "a";
			}

			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Sem usar Buffer => " + tempoTotal + " segundos");
		}
	}
}
