package br.com.cotiinformatica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.queries.CategoriasDto;
import br.com.cotiinformatica.infra.cache.CategoriaCache;

@Service
@EnableCaching
public class CategoriaService {
	
	@Autowired
	CategoriaCache categoriaCache;
	
	@Cacheable(value = "productsCache")
	public List<CategoriasDto> findAll() {
		return categoriaCache.findAll();
	}
}
