package com.swapi.films.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "Film")
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer episodeId = null;
    private String titulo = null;
    private String openingCrawl = null;
    private String releaseDate = null;
    @OneToMany
    List<Characters> characters = null;
    @OneToMany
    List<Planets> planets = null;
    @OneToMany
    List<Starships> starships = null;
    @OneToMany
    List<Vehicles> vehicles = null;
    @OneToMany
    List<Species> species = null;
    private LocalDate created = null;
    private LocalDate edited = null;
    private String url = null;


}
