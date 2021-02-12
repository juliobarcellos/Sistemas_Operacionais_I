package controller;

public class ThreadVetor extends Thread {
	private int n;
	private int[] v;

	public ThreadVetor(int n, int[] v) {
		this.n = n;
		this.v = v;
	}

	@Override
	public void run() {
		if (n % 2 == 0) {
			calculaTempoFor();
		} else {
			calculaTempoForEach();
		}
	}

	private void calculaTempoFor() {
		double tempoInicio = System.nanoTime();
		for (int i = 0; i < v.length; i++) {

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicio) / Math.pow(10, 9);
		System.out.println("Tempo para percorrer o vetor usando For = " + tempoTotal + " segundos.");
	}

	private void calculaTempoForEach() {
		double tempoInicio = System.nanoTime();
		for (int i : v) {

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicio) / Math.pow(10, 9);
		System.out.println("Tempo para percorrer o vetor usando ForEach = " + tempoTotal + " segundos.");
	}
}
