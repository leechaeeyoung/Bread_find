package com.example.Bread_find.repository;

import com.example.Bread_find.entity.Bakery;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class BakeryRepository implements JpaRepository<Bakery, Long> {
    @Override
    public List<Bakery> findAll() {
        return null;
    }

    @Override
    public List<Bakery> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Bakery> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Bakery> findAllById(Iterable<Long> longs) {
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
    public void delete(Bakery entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Bakery> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Bakery> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Bakery> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Bakery> findById(Long aLong) {
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
    public <S extends Bakery> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Bakery> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Bakery> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Bakery getOne(Long aLong) {
        return null;
    }

    @Override
    public Bakery getById(Long aLong) {
        return null;
    }

    @Override
    public Bakery getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Bakery> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Bakery> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Bakery> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Bakery> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Bakery> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Bakery> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Bakery, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
