package com.example.test_4.service;

public interface IGenerateService<E> {
    Iterable <E> findAll();

    E findOne(Long id);

    void save(E e);

    void delete(Long id);
}
