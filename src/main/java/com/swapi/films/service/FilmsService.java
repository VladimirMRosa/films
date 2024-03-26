package com.swapi.films.service;

import com.swapi.films.domain.Films;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface FilmsService {
    public List<Films> listarTodosOsFilmes();

    Optional<Films> listarFilmePorId(Long filmId);

}
