package br.com.agenda.modelo;

import java.util.List;

public class Projeto extends EntidadeDominio{

	private String nome;
	private Empresa cliente;
	private List<Produto>produtos;
	private String comentario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Empresa getCliente() {
		return cliente;
	}
	public void setCliente(Empresa cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}		
}
