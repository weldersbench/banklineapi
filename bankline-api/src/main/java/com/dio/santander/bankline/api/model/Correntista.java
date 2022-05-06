package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Nossa classe Correntista a partir de agora será uma entidade.
@Table(name = "tab_correntista") //JPA, os registro desta classe serão salvas na tabela tab_Correntista.
public class Correntista {
	@Id //JPA, essa coluna vai ser nossa ChavePrimaria da tabela, do registro do dataBase.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //JPA, essa classe Correntista vai ter uma ChavePrimaria, e quero que gerencia esta chave, de forma automatica
	private Integer id;
	
	@Column(length = 20) // O tamanho do campo
	private String cpf;
	
	@Column(length = 60)
	private String nome;
	
	@Embedded // As informações que estiverem na classe Conta, estaram na mesma tabela principal Correntista
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}