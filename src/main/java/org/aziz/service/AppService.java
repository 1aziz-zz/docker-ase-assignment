package org.aziz.service;

import java.util.List;

/**
 * Created by aziz on 5/12/17.
 */
public interface AppService<T> {

    List<T> getAll();
    void deleteAll();
    void add(T object);
    void delete(T object);

}
