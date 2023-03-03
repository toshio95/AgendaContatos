package br.com.agenda.dao;

import br.com.agenda.modelo.EntidadeDominio;

public interface IDao {
	
	public EntidadeDominio salvar (EntidadeDominio entidade);
	public EntidadeDominio editar (EntidadeDominio entidade);
	public EntidadeDominio retornar (EntidadeDominio entidade);
	public EntidadeDominio listar (EntidadeDominio entidade);
	public EntidadeDominio inativar (EntidadeDominio entidade);
	public EntidadeDominio excluir (EntidadeDominio entidade);
}
