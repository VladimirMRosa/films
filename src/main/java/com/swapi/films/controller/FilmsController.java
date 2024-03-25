package com.swapi.films.controller;

import com.swapi.films.api.FilmsApi;
import com.swapi.films.domain.Films;
import com.swapi.films.mapper.FilmsMapper;

import com.swapi.films.service.impl.FilmsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmsController implements FilmsApi {

    private FilmsServiceImpl service;
    private FilmsMapper mapper;

    public FilmsController(FilmsServiceImpl service,FilmsMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<List<com.swapi.films.models.Films>> filmsGet() {
        List<Films> listaDeFilmes = service.listarTodosOsFilmes();
        if(listaDeFilmes.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        List<com.swapi.films.models.Films> representationList = mapper.listarFilmes(listaDeFilmes);
        return ResponseEntity.ok(representationList);
    }
}
