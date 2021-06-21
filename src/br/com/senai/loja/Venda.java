package br.com.senai.loja;

import br.com.anthony.pessoa.Pessoa;
import br.com.senai.produto.Produto;
//CLASSE
public class Venda {
	//ATRIBUTOS
	private Pessoa pessoaa;
	private Produto produto;
	private int quantidade;
	private double valor;
	
	//METODOS
	public Pessoa getPessoaa() {
		return pessoaa;
	}
	public void setPessoaa(Pessoa pessoaa) {
		this.pessoaa = pessoaa;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


}