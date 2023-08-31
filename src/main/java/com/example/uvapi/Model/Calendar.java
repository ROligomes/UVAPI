package com.example.uvapi.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Calendar {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer cadastroId;
    
    private String type;

    private String category;

    private Date prunningDate;

    private Date harvestDate;

    private Integer harvestDays;

    private Integer prunningRestDays;

    private Integer producedAmountKg;

    
}
