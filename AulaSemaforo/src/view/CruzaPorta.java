package view;

import java.util.concurrent.Semaphore;
import controller.ThreadPorta;

public class CruzaPorta {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int idPessoa = 1; idPessoa <5; idPessoa++) {
			Thread pessoa = new ThreadPorta(idPessoa, semaforo);
			pessoa.start();
		}
	}

}
