package com.contabilidad.nf.domain.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "CLIENTES")
@EqualsAndHashCode(of = "id", callSuper = false)
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Long    id;

	@Column(name = "cli_nome")
	private String  nome;

	@Column(name = "cli_email")
    private String  email;

	@Column(name = "cli_cnpj")
	private Long    cnpj;

	@Column(name = "cli_logradouro")
	private String  logradouro;

	@Column(name = "cli_numero")
	private String  numero;

	@Column(name = "cli_complemento")
	private String  complemento;

	@Column(name = "cli_bairro")
	private String  bairro;

	@Column(name = "cli_cep")
	private Integer cep;
			
	public Cliente() {
	}

	public Cliente(Long id, String nome, String email, Long cnpj, String logradouro, String numero, String complemento,
			String bairro, Integer cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

}
