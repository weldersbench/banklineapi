package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Correntista;
// Criação de uma interFace para poder salvar os correntistas.
// extends - vai estender do framework "correntista" para outra interFace "JPA"
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer>{

}
