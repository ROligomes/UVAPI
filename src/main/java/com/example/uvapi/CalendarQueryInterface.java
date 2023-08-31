package com.example.uvapi;

import java.util.List;

import com.example.uvapi.Model.Calendar;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CalendarQueryInterface extends CrudRepository<Calendar, Integer> {
    
    @Query(value = "SELECT * FROM Calendar c WHERE c.cadastro_Id = :cadastroId", 
        nativeQuery = true
    )
    List<Calendar> finCalendarByCadastroId( @Param("cadastroId") Integer cadastroId );

}
