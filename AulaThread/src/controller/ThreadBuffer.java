package controller;

public class ThreadBuffer extends Thread{


	
	@Override
	public void run() {
		calc();
	}
	
	public void calc () {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		
		for (int i=0; i<32768; i++) {
			buffer.append("a");
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal-tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Em Buffer => "+tempoTotal+" segundos");
	}
}
