package br.com.ericobalboa.aulajava04exercicios;

public class UsaEstoque {
	public static void main(String[] args) {
		Estoque estoque1 = new Estoque();
		Estoque estoque2 = new Estoque();
		Estoque estoque3 = new Estoque();

		estoque1.SetNome("Pão");
		estoque1.quantidadeAtual = 10;
		estoque1.quantidadeMinima = 5;

		estoque2.SetNome("Suco");
		estoque2.quantidadeAtual = 20;
		estoque2.quantidadeMinima = 8;

		estoque3.SetNome("Queijo");
		estoque3.quantidadeAtual = 100;
		estoque3.quantidadeMinima = 50;

		estoque1.darBaixa(5);
		estoque2.repor(10);
		estoque3.darBaixa(3);

		if (estoque1.precisaRepor()) {
			System.out.println("Precisa repor o estoque de " + estoque1.nome);
		} else {
			System.out.println("Estoque de " + estoque1.nome + " ok.");
		}
		
		if (estoque2.precisaRepor()) {
			System.out.println("Precisa repor o estoque de " + estoque2.nome);
		} else {
			System.out.println("Estoque de " + estoque2.nome + " ok.");
		}
		
		if (estoque3.precisaRepor()) {
			System.out.println("Precisa repor o estoque de " + estoque3.nome);
		} else {
			System.out.println("Estoque de " + estoque3.nome + " ok.");
		}
		
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
	}

}
