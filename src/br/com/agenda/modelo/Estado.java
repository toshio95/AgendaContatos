package br.com.agenda.modelo;

public class Estado extends EntidadeDominio {
	
	private String sigla;
	private Pais pais;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}	
}
