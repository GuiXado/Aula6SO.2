package controller;

import java.util.concurrent.Semaphore;

public class Pessoa extends Thread {

	private int tid;
	private static Semaphore mutex = new Semaphore(1);

	public void run() {
		tid = (int) threadId();
		andar();

		try {
			mutex.acquire();
			porta();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			mutex.release();
		}
	}

	private void andar() {
		int distancia = 200;
		int caminhar = 0;
		while (caminhar < distancia) {
			caminhar += (int)((Math.random() * 3) + 4);
		}

	}

	private void porta() {
		System.out.println("#" + tid + " Saiu!");
		try {
			sleep((int)((Math.random() * 1001) + 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
