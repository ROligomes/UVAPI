package com.example.uvapi;

import com.example.uvapi.Model.Calendar;

import org.springframework.data.repository.CrudRepository;

public interface CalendarRepository extends CrudRepository<Calendar, Integer> {
    
}
