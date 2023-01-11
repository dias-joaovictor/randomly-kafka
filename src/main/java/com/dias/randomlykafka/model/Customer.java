package com.dias.randomlykafka.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Customer {
    private String id;
    private String name;
    private LocalDate birthDate;
}
