package br.com.fiap.Global.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.Global.model.PublicacaoModel;

@Repository
public interface PublicacaorRepository extends JpaRepository<PublicacaoModel, Integer>{

}
