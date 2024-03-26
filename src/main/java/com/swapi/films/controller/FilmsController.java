package com.swapi.films.controller;

import com.swapi.films.api.FilmsApi;
import com.swapi.films.mapper.FilmsMapper;
import com.swapi.films.models.Films;
import com.swapi.films.service.impl.FilmsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FilmsController implements FilmsApi {

    private FilmsServiceImpl service;
    private FilmsMapper mapper;

    public FilmsController(FilmsServiceImpl service,FilmsMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<List<Films>> filmsGet() {

        List<com.swapi.films.domain.Films> listaDeFilmes = service.listarTodosOsFilmes();
        if(listaDeFilmes.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        List<Films> representationList = mapper.listarFilmes(listaDeFilmes);
        return ResponseEntity.ok(representationList);
    }

    @Override
    public ResponseEntity<Films> getFilmId(Long filmId) {
        Optional<com.swapi.films.domain.Films> listaDeFilmes = service.listarFilmePorId(filmId);
        if(listaDeFilmes.isPresent()){
            Films representationList = mapper.filmeById(listaDeFilmes);
            return ResponseEntity.ok(representationList);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<Films>> findByTags(List<String> tags) {
        return FilmsApi.super.findByTags(tags);
    }

    @Override
    public ResponseEntity<List<Films>> findByStatus(List<String> status) {
        return FilmsApi.super.findByStatus(status);
    }

    @Override
    public ResponseEntity<Void> updateFilmWithForm(Long filmId, String name, String status) {
        return FilmsApi.super.updateFilmWithForm(filmId, name, status);
    }

    @Override
    public ResponseEntity<Void> deleteId(Long filmId) {
        return FilmsApi.super.deleteId(filmId);
    }
}
