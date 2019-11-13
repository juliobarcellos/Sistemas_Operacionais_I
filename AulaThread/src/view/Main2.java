package view;

import controller.Thread2;
import java.util.Random;
public class Main2 {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i=0;i<10;i++) {
			int n = r.nextInt(10);
			if (n%2==0) {
				n++;
			};
			Thread t = new Thread2(n);
			t.start();
		}
	}

}
