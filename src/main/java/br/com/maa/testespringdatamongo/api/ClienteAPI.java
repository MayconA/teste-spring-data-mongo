package br.com.maa.testespringdatamongo.api;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maa.testespringdatamongo.model.Cliente;
import br.com.maa.testespringdatamongo.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteAPI {

	@Autowired
	private ClienteService servico;

	@GetMapping
	public ResponseEntity<List<Cliente>> getAll() {

		List<Cliente> clientes = servico.findAll();

		return ResponseEntity.ok(clientes);

	}

	@GetMapping("/{doc}")
	public ResponseEntity<?> getByDoc(@PathVariable String doc) {
		Optional<Cliente> cliente = servico.findOne(doc);

		if (Objects.isNull(cliente)) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(cliente);
		}

	}

}
