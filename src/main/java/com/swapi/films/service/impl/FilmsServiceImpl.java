package com.swapi.films.service.impl;

import com.swapi.films.domain.Films;
import com.swapi.films.repository.impl.FilmsRepositoryImpl;
import com.swapi.films.service.FilmsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    private final FilmsRepositoryImpl repository;

    public FilmsServiceImpl(FilmsRepositoryImpl repository){
        this.repository = repository;
    }
    @Override
    public List<Films> listarTodosOsFilmes() {
        return repository.findAll();
    }
}
