package br.com.cotiinformatica.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 250, nullable = false)
	private String descricao;
	
	@Column(nullable = false, precision = 18, scale = 2)
	private BigDecimal preco;
	
	@Column(nullable = false)
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "categoria_od", nullable = false)
	private Categoria categoria;
}
