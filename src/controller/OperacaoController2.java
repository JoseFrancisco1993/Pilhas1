package controller;

import br.com.leandrocolevati.pilhaint.Pilha;

public class OperacaoController2 {

	public OperacaoController2() {
		super();
	}
	
	public int maiorValor(Pilha pilha) {
		Pilha pilha1 = pilha;
		int num = 0, num1 = 0;
		
		for (int i=0; i < 15;i++) {
			try {
				num = pilha.pop();
				num1 = pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (num > num1) {
				pilha.push(num);
			}else { 
				pilha.push(num1);
				
			}
		} 
		try {
			int maior = pilha.top();
			return maior;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
		
	}

}
