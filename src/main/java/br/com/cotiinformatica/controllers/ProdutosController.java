package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.commands.ProdutoCreateCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoDeleteCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoUpdateCommand;
import br.com.cotiinformatica.dtos.queries.ProdutosDto;
import br.com.cotiinformatica.services.ProdutoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {
	
	@Autowired
	ProdutoService service;
	
	@PostMapping
	public ResponseEntity<ProdutosDto> post(@RequestBody @Valid ProdutoCreateCommand command) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(command));
	}
	
	@PutMapping
	public ResponseEntity<ProdutosDto> put(@RequestBody @Valid ProdutoUpdateCommand command) {
		return ResponseEntity.status(HttpStatus.OK).body(service.update(command));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ProdutosDto> delete(@PathVariable("id") Integer id) {
		ProdutoDeleteCommand command = new ProdutoDeleteCommand();
		command.setId(id);
		return ResponseEntity.status(HttpStatus.OK).body(service.delete(command));
	}
	
	@GetMapping
	public ResponseEntity<List<ProdutosDto>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutosDto> getById(@PathVariable("id") Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
	}
}
