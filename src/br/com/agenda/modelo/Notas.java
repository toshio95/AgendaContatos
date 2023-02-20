package br.com.agenda.modelo;

public class Notas extends EntidadeDominio {

	private Empresa empresa;
	private String local;
	private String comentario;
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String localContato) {
		this.local = localContato;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}	
}
