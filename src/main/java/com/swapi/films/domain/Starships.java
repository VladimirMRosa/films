package com.swapi.films.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Starships")
public class Starships {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String starships;
}
