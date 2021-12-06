package com.online.bookstore.OnlineBookStoreApplication.service;

import java.util.List;

public interface AbstractService<T>{
    T create(T t);
    T update(T t);
    boolean delete(Long id);
    List<T> getAllByActive(boolean active);
    T getById(Long id);
}
