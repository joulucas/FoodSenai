package br.co.foodSenai.service;

import java.util.List;
import java.util.Optional;

import br.co.foodSenai.domain.Cliente;

public interface ClienteService {

	  Optional<Cliente> findById(Long codigo);
	  
	  List<Cliente> findAll();
}
