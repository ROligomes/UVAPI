package com.example.uvapi;

import com.example.uvapi.Model.Cadastro;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CadastroRepository extends CrudRepository<Cadastro, Integer> {
    
}