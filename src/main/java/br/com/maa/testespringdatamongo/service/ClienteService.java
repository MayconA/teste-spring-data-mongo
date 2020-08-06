package br.com.maa.testespringdatamongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maa.testespringdatamongo.model.Cliente;
import br.com.maa.testespringdatamongo.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public List<Cliente> findAll() {
		return repo.findAll();
	}

	public Optional<Cliente> findOne(String doc) {
		
		return repo.findById(doc);
	}

}
