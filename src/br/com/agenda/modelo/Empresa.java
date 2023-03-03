package br.com.agenda.modelo;

public class Empresa extends EntidadeDominio{
	
	private String nome;
	private Cidade cidade;
	private String website;
	private boolean fornecedor;
	private boolean cliente;
	private boolean concorrente;
	private boolean portal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public boolean isFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(boolean fornecedor) {
		this.fornecedor = fornecedor;
	}
	public boolean isCliente() {
		return cliente;
	}
	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}
	public boolean isConcorrente() {
		return concorrente;
	}
	public void setConcorrente(boolean concorrente) {
		this.concorrente = concorrente;
	}
	public boolean isPortal() {
		return portal;
	}
	public void setPortal(boolean portal) {
		this.portal = portal;
	}

}
