package controller;

import java.util.concurrent.Semaphore;

public class DepositoThread extends Thread {
	private int idConta;
	private double saldoConta;
	private double valorTransacao;
	private Semaphore limitacao;

	public DepositoThread(int idConta, double saldoConta, double valorTransacao, Semaphore limitacao) {
		this.idConta = idConta;
		this.saldoConta = saldoConta;
		this.valorTransacao = valorTransacao;
		this.limitacao = limitacao;
	}
	
	@Override
	public void run() {
		try {
			limitacao.acquire();
			creditar();
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		limitacao.release();
	}
	
	public void creditar() {
		System.out.print("Saldo Anterior: R$ " + saldoConta);
		this.saldoConta += valorTransacao;
		System.out.println("Conta: "+idConta+". Deposito no valor de: R$ " +valorTransacao + " Novo saldo: R$" + saldoConta);
	}

}