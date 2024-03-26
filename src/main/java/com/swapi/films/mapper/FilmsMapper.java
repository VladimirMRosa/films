package com.swapi.films.mapper;

import com.swapi.films.models.Films;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public abstract class FilmsMapper {

    public abstract List<Films> listarFilmes (List<com.swapi.films.domain.Films> response);

    public abstract Films filmeById(Optional<com.swapi.films.domain.Films> listaDeFilmes);
}