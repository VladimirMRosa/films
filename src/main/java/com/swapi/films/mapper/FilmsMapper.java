package com.swapi.films.mapper;

import com.swapi.films.domain.Film;
import com.swapi.films.models.Films;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class FilmsMapper {

    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "Planets", target = "Planets")
    @Mapping(source = "Specie", target = "Species")
    @Mapping(source = "Startship", target = "Starships")
    @Mapping(source = "Vehicle", target = "Vehicles")
    @Mapping(source = "planet", target = "planets")
    @Mapping(source = "specie", target = "species")
    @Mapping(source = "startship", target = "starships")
    @Mapping(source = "vehicles", target = "vehicle")
    @Mapping(target = "created", source = "created", qualifiedByName = "startTime")
    @Mapping(target = "edited", source = "edited", qualifiedByName = "endTime")
    public abstract List<Films> listarFilmes (List<com.swapi.films.domain.Films> response);

    @Named("startTime")
    OffsetDateTime mapStartTime(Film film, @Context DateTimeFormatter dateTimeFormatter) {
        LocalDateTime localDateTime = LocalDateTime.parse(film.getCreated(), dateTimeFormatter);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(film.getCreated()));
        return zonedDateTime.toOffsetDateTime();
    }

    @Named("endTime")
    OffsetDateTime mapEndTime(Film film, @Context DateTimeFormatter dateTimeFormatter) {
        LocalDateTime localDateTime = LocalDateTime.parse(film.getEdited(), dateTimeFormatter);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(film.getEdited()));
        return zonedDateTime.toOffsetDateTime();
    }

}