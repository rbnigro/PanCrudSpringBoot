package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TarefasModel;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {

}
