package br.edu.infnet.vendaApi.controller.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.vendaApi.controller.model.domain.Informacao;

public interface InformacaoRepository extends CrudRepository<Informacao, Integer>{

}
