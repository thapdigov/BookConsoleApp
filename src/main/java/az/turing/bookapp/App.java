package az.turing.bookapp;

import az.turing.bookapp.domain.dao.impl.memory.PassengerInmemory;
import az.turing.bookapp.domain.dao.inter.PassengerDao;
import az.turing.bookapp.domain.entity.PassengerEntity;

public class App {
    public static void main(String[] args) {

        PassengerEntity passengerEntity = new PassengerEntity("1", "Sanan", "Tapdigov");
        PassengerDao passengerDao = new PassengerInmemory();
        passengerDao.insert(passengerEntity);

        System.out.println(passengerDao.update(passengerEntity));


    }
}
