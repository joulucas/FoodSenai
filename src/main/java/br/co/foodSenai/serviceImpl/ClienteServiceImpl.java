package br.co.foodSenai.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.co.foodSenai.domain.Cliente;
import br.co.foodSenai.repository.ClienteRepository;
import br.co.foodSenai.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Optional<Cliente> findById(Long codigo) {
		return clienteRepository.findById(codigo);
	}

	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
