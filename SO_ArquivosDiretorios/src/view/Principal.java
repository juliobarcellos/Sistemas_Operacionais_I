package view;

import java.io.IOException;

import controller.ArquivosController;

public class Principal {
	public static void main(String[] args) {
		ArquivosController arqCont = new ArquivosController();
		String dir = "C:\\users\\julio\\";
//		String nome = "teste.txt";
		String nome2 = "teste.csv";
		try {
			arqCont.readDir(dir);
			arqCont.createFile(dir, nome2);
			arqCont.readFile(dir, nome2);
			arqCont.openFile(dir, nome2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
