package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.commands.ProdutoCreateCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoUpdateCommand;
import br.com.cotiinformatica.dtos.queries.ProdutosDto;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {
	
	@PostMapping
	public void post(@RequestBody ProdutoCreateCommand command) {
		//TODO
	}
	
	@PutMapping
	public void put(@RequestBody ProdutoUpdateCommand command) {
		//TODO
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		//TODO
	}
	
	@GetMapping
	public ResponseEntity<List<ProdutosDto>> getAll() {
		//TODO
		return null;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutosDto> getById(@PathVariable("id") Integer id) {
		//TODO
		return null;
	}
}
