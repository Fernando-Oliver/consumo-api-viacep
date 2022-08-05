package com.dio.com.br.consumoapiviacep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.com.br.consumoapiviacep.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}