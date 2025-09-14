package view;

import controller.Pessoa;

public class Porta {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {
			Pessoa p = new Pessoa();
			p.start();
		}

	}

}
