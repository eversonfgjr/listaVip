package br.com.treinamento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.treinamento.entity.Convidado;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{

}
