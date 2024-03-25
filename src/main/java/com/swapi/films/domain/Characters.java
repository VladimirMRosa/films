package com.swapi.films.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Characters")
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String characters;
}
