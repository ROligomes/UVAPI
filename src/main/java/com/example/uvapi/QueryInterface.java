package com.example.uvapi;

import java.util.List;

import com.example.uvapi.Model.Cadastro;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface QueryInterface extends CrudRepository<Cadastro, Integer> {
    
    @Query(value = "SELECT * FROM Cadastro c WHERE c.email = :email", 
        nativeQuery = true
    )
    List<Cadastro> finCadastroByEmail( @Param("email") String email );

}
