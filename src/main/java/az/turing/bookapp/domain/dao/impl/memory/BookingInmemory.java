package az.turing.bookapp.domain.dao.impl.memory;

import az.turing.bookapp.domain.dao.inter.BookingDao;
import az.turing.bookapp.domain.entity.BookingEntity;

import java.util.Collection;
import java.util.Optional;

public class BookingInmemory extends BookingDao {
    @Override
    public BookingEntity insert(BookingEntity bookingEntity) {
        return null;
    }

    @Override
    public BookingEntity update(BookingEntity bookingEntity) {
        return null;
    }

    @Override
    public BookingEntity delete(String s) {
        return null;
    }

    @Override
    public Collection<BookingEntity> getAll() {
        return null;
    }

    @Override
    public Optional<BookingEntity> getById(String s) {
        return Optional.empty();
    }
}
