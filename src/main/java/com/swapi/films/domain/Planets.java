package com.swapi.films.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Planets")
public class Planets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String planets;
}
