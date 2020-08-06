package br.com.maa.testespringdatamongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.maa.testespringdatamongo.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
