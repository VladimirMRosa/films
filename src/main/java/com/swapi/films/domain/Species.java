package com.swapi.films.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String species;
}
