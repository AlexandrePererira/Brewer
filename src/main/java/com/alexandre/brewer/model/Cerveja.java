package com.alexandre.brewer.model;



import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;


public class Cerveja {
	
	@NotBlank(message = "SKU é obrigatório")
	private String sku;
	
	@NotBlank(message = "Nome é obrigátorio")
	private String nome;
	
	
	@Size(min = 10 , max = 100 , message = "Numero máximo de caracter 10 e numero minímo de caracter 5")
	private String descricao;
	
	
	public Cerveja() {
		
	}
	
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
