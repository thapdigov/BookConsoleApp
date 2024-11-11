package az.turing.bookapp.domain.entity;

import java.util.List;
import java.util.Objects;

public class BookingEntity {
    private final String bookId;
    private final FlightEntity flightEntity;
    private final List<PassengerEntity> passengerList;

    public BookingEntity(String bookId, FlightEntity flightEntity, List<PassengerEntity> passengerList) {
        this.bookId = bookId;
        this.flightEntity = flightEntity;
        this.passengerList = passengerList;
    }

    public String getBookId() {
        return bookId;
    }


    public FlightEntity getFlightEntity() {
        return flightEntity;
    }


    public List<PassengerEntity> getPassengerList() {
        return passengerList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingEntity that = (BookingEntity) o;
        return bookId.equals(that.bookId) && Objects.equals(flightEntity, that.flightEntity) && Objects.equals(passengerList, that.passengerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, flightEntity, passengerList);
    }

    @Override
    public String toString() {
        return "BookingEntity [ bookId :%s ,flightEntity: %s,passengerList :%s"
                .formatted(bookId, flightEntity, passengerList);

    }
}
