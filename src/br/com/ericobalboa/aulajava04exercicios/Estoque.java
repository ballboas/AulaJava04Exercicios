package br.com.ericobalboa.aulajava04exercicios;

public class Estoque {
	
	String nome ;
	int    quantidadeMinima;
	int    quantidadeAtual;
	
	
	public void SetNome(String nome){
		this.nome = nome;
	}
	
	public void mudarQuantidadeMinima(int quantidadeMinima){
		if ( quantidadeMinima < 0 ){
			System.out.println("Qtd Minima não pode ser negativa");
		}else{
			this.quantidadeMinima = quantidadeMinima;
		}
	}
	
	public void repor(int qtd){
		this.quantidadeAtual += qtd;
	}
	
	public void darBaixa (int qtd){
		if ((this.quantidadeAtual - qtd)<0){
			System.out.println("Qtd Atual não pode ficar negativa");
		} else {
			this.quantidadeAtual -= qtd;
		}
	}
	
	public String mostra(){
		return "Nome "+this.nome +" Qtd Min: "+this.quantidadeMinima+" Qtd Atual: "+this.quantidadeAtual; 
	}
	
	public boolean precisaRepor(){
		if (this.quantidadeAtual<=this.quantidadeMinima){
			return true;
		}
		return false;
	}
}
