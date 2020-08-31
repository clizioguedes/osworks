package com.algaworks.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	// BUSCAR CLIENTE POR NOME EXATO
	List<Cliente> findByNome(String nome);
	// BUSCAR CLIENTE POR PARTE DO NOME
	List<Cliente> findByNomeContaining(String nome);
	// RETORNA UM EMAIL DE UM CLIENTE EXISTENTE
	Cliente findByEmail(String email);
}
