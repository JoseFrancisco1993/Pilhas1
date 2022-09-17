package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal3 {

	public static void main(String[] args) {

		OperacaoController3 fat = new OperacaoController3();

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 20"));
		
		if (num < 0 || num > 20) {
			System.out.println("Valor invalido");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 20"));
		}

		long res = fat.fatorial(num);
		System.out.println("Resultado fatorial: " + res);
	}
}
