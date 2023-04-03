package ra.service;

import java.util.List;

public interface IGenericService<E> {
    List<E> findAll();

    void save(E e);

    E findByID(int id);

    void deleteById(int id);
}
