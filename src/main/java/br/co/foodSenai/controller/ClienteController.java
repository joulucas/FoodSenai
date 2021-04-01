package br.co.foodSenai.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.co.foodSenai.domain.Cliente;
import br.co.foodSenai.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping(path = "/{codigo}")
	public Optional<Cliente> getCliente(@PathVariable Long codigo) {
		return service.findById(codigo);
	}
	
	@GetMapping
	public List<Cliente> findAll(){
	   return service.findAll();
	}
	
	  @PostMapping("/salvar")
	  public Cliente newEmployee(@RequestBody Cliente cliente) {
	    return service.save(cliente);
	  }

 
}
