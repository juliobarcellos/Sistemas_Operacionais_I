package view;

import controller.ThreadVetor;

public class Main_Ex1 {
	public static int vetor [] = new int [1000];
	
	public static void main(String[] args) {
		
		for (int i : vetor) {
			vetor[i] = (int) Math.random() * (100 - 1) + 1;
		}
		
		ThreadVetor tv1 = new ThreadVetor(1, vetor);
		ThreadVetor tv2 = new ThreadVetor(2, vetor);
		tv1.start();
		tv2.start();
	}
}
