package com.swapi.films.repository;

import com.swapi.films.domain.Films;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface FilmsRepository extends JpaRepository<Films, Long>{

    Optional<Films> findById (Long filmId);

}
