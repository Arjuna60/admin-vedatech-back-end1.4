package com.vedatech.admin.services;


import java.util.List;

public interface CrudServices<T, ID> {

    List<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

    void saveAll(List<T> object);
}
