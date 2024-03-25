package com.swapi.films.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Vehicles")
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String vehicles;
}
