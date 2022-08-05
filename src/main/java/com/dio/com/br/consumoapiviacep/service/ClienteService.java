package com.dio.com.br.consumoapiviacep.service;

import com.dio.com.br.consumoapiviacep.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
