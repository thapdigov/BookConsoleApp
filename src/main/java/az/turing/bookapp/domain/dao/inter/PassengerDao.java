package az.turing.bookapp.domain.dao.inter;

import az.turing.bookapp.domain.dao.Dao;
import az.turing.bookapp.domain.entity.FlightEntity;
import az.turing.bookapp.domain.entity.PassengerEntity;

public abstract class PassengerDao implements Dao<PassengerEntity, String> {

    public  abstract boolean existsById(String ID);
}
