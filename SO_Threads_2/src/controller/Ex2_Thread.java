package controller;

public class Ex2_Thread extends Thread{
	private int n;
	
	public Ex2_Thread() {
		this.n = (int) this.getId();
	}
	
	@Override
	public void run() {
		Mostrar();
	}
	
	public void Mostrar() {
		System.out.println("Thread nº "+n+" rodando");
	}
}
