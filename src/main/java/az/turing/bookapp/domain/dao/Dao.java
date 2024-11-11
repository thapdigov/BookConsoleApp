package az.turing.bookapp.domain.dao;

import java.util.Collection;
import java.util.Optional;

public interface Dao<E, T> {

    E insert(E e);

    E update(E e);

    E delete(T t);

    Collection<E> getAll();

    Optional<E> getById(T t);

}
