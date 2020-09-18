package controller;

public class Ex1Thread extends Thread{
	private int n;
	
	public Ex1Thread() {
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
