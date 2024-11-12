package az.turing.bookapp.domain.dao.impl.memory;

import az.turing.bookapp.domain.dao.inter.PassengerDao;
import az.turing.bookapp.domain.entity.PassengerEntity;
import az.turing.bookapp.util.InputUtil;

import java.util.*;

public class PassengerInmemory extends PassengerDao {

    public Map<String, PassengerEntity> passengerEntityList = new HashMap<>();
    public final InputUtil inputUtil = new InputUtil();


    @Override
    public PassengerEntity insert(PassengerEntity passengerEntity) {
        if (passengerEntityList.containsKey(passengerEntity.getPassengerId())) {
            System.out.println("Passenger with Id " + passengerEntity.getPassengerId() + " already exists!");
            return null;
        }
        passengerEntityList.put(passengerEntity.getPassengerId(), passengerEntity);
        return passengerEntity;
    }

    @Override
    public PassengerEntity update(PassengerEntity passengerEntity) {

        int choose = inputUtil.getInteger("""
                Choose the entityField you want to change!
                1.Passenger ID
                2.Passenger name
                3.Passenger surname"""
        );
        switch (choose) {
            case 1 -> passengerEntity.setPassengerId(inputUtil.getString("Enter the new PassengerID"));
            case 2 -> passengerEntity.setPassengerName(inputUtil.getString("Enter the new Passenger name"));
            case 3 -> passengerEntity.setPassengerSurname(inputUtil.getString("Enter the new Passenger surname"));
            default -> System.out.println("Invalid input!");
        }
        passengerEntityList.put(passengerEntity.getPassengerId(), passengerEntity);
        return passengerEntity;
    }

    @Override
    public PassengerEntity delete(String passengerId) {
        if (!(passengerEntityList.containsKey(passengerId))) {
            System.out.println("Passenger with Id " + passengerId + " is not found!");
            return null;
        } else {
            System.out.println("Passenger with Id " + passengerId + " has been deleted!");
            return passengerEntityList.remove(passengerId);

        }
    }

    @Override
    public Collection<PassengerEntity> getAll() {
        return passengerEntityList.values();
    }

    @Override
    public Optional<PassengerEntity> getById(String passengerId) {
        return Optional.ofNullable(passengerEntityList.get(passengerId));
    }

    @Override
    public boolean existsById(String ID) {
        return !passengerEntityList.containsKey(ID);
    }
}
