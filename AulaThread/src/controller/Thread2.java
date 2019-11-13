package controller;

public class Thread2 extends Thread{
	private int n;
	
	public Thread2(int n) {
		this.n=n;
	}
	
	@Override
	public void run() {
		calc();
	}
	
	public void calc () {
		double res=0.0;
		int o=1;
		for (int i=1; i<=n;i++) {
			if (i%2!=0) {
				res=res+((1.0/i)*o);
			}
			else {
				o=o*-1;
			}
		}
		res=4*res;
		System.out.println("Serie com número "+n+" = "+res);
	}
}
