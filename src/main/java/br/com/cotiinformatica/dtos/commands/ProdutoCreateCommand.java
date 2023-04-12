package br.com.cotiinformatica.dtos.commands;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProdutoCreateCommand {

	@NotBlank(message = "Nome é obrigatório.")
	@Size(min = 8, max = 150, message = "Nome deve ter de 8 a 100 caracteres.")
	private String nome;

	@NotBlank(message = "Descrição é obrigatório.")
	@Size(min = 8, max = 150, message = "Descrição deve ter de 8 a 250 caracteres.")
	private String descricao;

	@Min(value = 1, message = "Preço deve ser maior ou igual a 1.")
	private BigDecimal preco;

	@Min(value = 1, message = "Quantidade deve ser maior ou igual a 1.")
	private Integer quantidade;

	@Min(value = 1, message = "Id da categoria deve ser maior ou igual a 1.")
	private Integer idCategoria;
}
