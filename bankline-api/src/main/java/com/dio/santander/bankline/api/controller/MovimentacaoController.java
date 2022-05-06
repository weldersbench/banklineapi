package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;
import com.dio.santander.bankline.api.service.MovimentacaoService;

@RestController // Trabalhar com um controlador
@RequestMapping("/movimentacoes") // Quando mencionado á correntistas, vai tentar fazer operações relacionadas ao banco de dados
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository; // Buscar as informações relacionadas ao banco de dados
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){ // Retorna os dados capturados no repositorio.
		return repository.findAll();
		
	}
	
	@PostMapping // Responsavel de receber uma novo correntista - @RequestBody diz que esse novo correntista faz parte do corpo da requisição.
	public void save(@RequestBody NovaMovimentacao movimentacao) { // Salvar um novo correntista no banco de dados
		service.save(movimentacao);
	}

}
