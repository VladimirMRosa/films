package com.swapi.films.mapper;

import com.swapi.films.domain.Film;
import com.swapi.films.models.Films;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public abstract class FilmsMapper {

    @Mapping(source = "titulo", target = "title")
    @Mapping(target = "created", source = "created", qualifiedByName = "startTime")
    @Mapping(target = "edited", source = "edited", qualifiedByName = "endTime")
    @Mapping(target = "character",source = "character", qualifiedByName = "Character")
    public abstract List<Films> listarFilmes (List<com.swapi.films.domain.Films> response);

    @Named("Character")
    List<Character> chars = st.chars()
            .mapToObj(e->(char)e).collect(Collectors.toList());

    @Named("startTime")
    OffsetDateTime mapStartTime(Film startTime, @Context DateTimeFormatter dateTimeFormatter) {
        return null;
    }

    @Named("endTime")
    OffsetDateTime mapEndTime(Film endTime, @Context DateTimeFormatter dateTimeFormatter) {
        return null;
    }

}
