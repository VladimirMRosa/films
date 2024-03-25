package com.swapi.films.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer episodeId = null;
    private String title = null;
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
    private String created = null;
    private String edited = null;
    private String url = null;


}
