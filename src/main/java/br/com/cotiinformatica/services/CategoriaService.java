package br.com.cotiinformatica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.queries.CategoriasDto;
import br.com.cotiinformatica.infra.cache.CategoriaCache;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaCache categoriaCache;
	
	public List<CategoriasDto> findAll() {
		return categoriaCache.findAll();
	}
}
