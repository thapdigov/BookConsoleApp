package az.turing.bookapp.domain.dao.impl.memory;

import az.turing.bookapp.domain.dao.inter.FlightDao;
import az.turing.bookapp.domain.entity.FlightEntity;

import java.util.Collection;
import java.util.Optional;

public class FlightInmemory extends FlightDao {

    @Override
    public FlightEntity insert(FlightEntity flightEntity) {
        return null;
    }

    @Override
    public FlightEntity update(FlightEntity flightEntity) {
        return null;
    }

    @Override
    public FlightEntity delete(String s) {
        return null;
    }

    @Override
    public Collection<FlightEntity> getAll() {
        return null;
    }

    @Override
    public Optional<FlightEntity> getById(String s) {
        return Optional.empty();
    }
}
