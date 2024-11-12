package az.turing.bookapp.domain.dao.impl.memory;

import az.turing.bookapp.domain.dao.inter.BookingDao;
import az.turing.bookapp.domain.entity.BookingEntity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BookingInmemory extends BookingDao {

    Map<String, BookingEntity> bookList = new HashMap<>();


    @Override
    public BookingEntity insert(BookingEntity bookingEntity) {
        if ((bookList.containsKey(bookingEntity.getBookId()) && bookingEntity.getFlightEntity() != null)) {
            System.out.println("This passenger already exists in this flight!");
        } else {
            bookList.put(bookingEntity.getBookId(), bookingEntity);
        }
        return bookingEntity;
    }

    @Override
    public BookingEntity update(BookingEntity bookingEntity) {
        return null;
    }

    @Override
    public BookingEntity delete(String bookingID) {
        return bookList.remove(bookingID);
    }

    @Override
    public Collection<BookingEntity> getAll() {
        return bookList.values();
    }

    @Override
    public Optional<BookingEntity> getById(String bookId) {
        return Optional.ofNullable(bookList.get(bookId));
    }
}
