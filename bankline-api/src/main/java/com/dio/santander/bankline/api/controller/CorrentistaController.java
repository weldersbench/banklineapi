package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;

@RestController // Trabalhar com um controlador
@RequestMapping("/correntistas") // Quando mencionado á correntistas, vai tentar fazer operações relacionadas ao banco de dados
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository; // Buscar as informações relacionadas ao banco de dados
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Correntista> findAll(){ // Retorna os dados capturados no repositorio.
		return repository.findAll();
		
	}
	
	@PostMapping // Responsavel de receber uma novo correntista - @RequestBody diz que esse novo correntista faz parte do corpo da requisição.
	public void save(@RequestBody NovoCorrentista correntista) { // Salvar um novo correntista no banco de dados
		service.save(correntista);
	}

}
