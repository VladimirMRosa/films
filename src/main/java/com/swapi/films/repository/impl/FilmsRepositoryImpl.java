package com.swapi.films.repository.impl;

import com.swapi.films.domain.Film;
import com.swapi.films.domain.Films;
import com.swapi.films.repository.FilmsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
@Slf4j
public class FilmsRepositoryImpl implements FilmsRepository{

    @Override
    public Optional<Films> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Films> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Films> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Films> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Films getOne(Long aLong) {
        return null;
    }

    @Override
    public Films getById(Long aLong) {
        return null;
    }

    @Override
    public Films getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Films> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Films> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Films> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Films> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Films> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Films> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Films, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Films> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Films> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Films> findAll() {
        return null;
    }

    @Override
    public List<Films> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Films entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Films> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Films> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Films> findAll(Pageable pageable) {
        return null;
    }
}
