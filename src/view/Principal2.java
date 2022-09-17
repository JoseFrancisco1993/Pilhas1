package view;

import br.com.leandrocolevati.pilhaint.Pilha;
import controller.OperacaoController2;

public class Principal2 {
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		OperacaoController2 operacaoController = new OperacaoController2();
		
		for (int i=0; i < 15; i++) {
			int numero = (int) ((Math.random()*50)+1);
			pilha.push(numero);
			System.out.println(numero);
		}
		int resto = operacaoController.maiorValor(pilha);
		System.out.println(resto);
	}

}
