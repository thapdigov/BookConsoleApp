package az.turing.bookapp.domain.dao.impl.memory;

import az.turing.bookapp.domain.dao.inter.FlightDao;
import az.turing.bookapp.domain.entity.FlightEntity;
import az.turing.bookapp.util.InputUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightInmemory extends FlightDao {

    public Map<String, FlightEntity> flightList = new HashMap<>();
    public final InputUtil inputUtil = new InputUtil();

    @Override
    public FlightEntity insert(FlightEntity flightEntity) {
        if (!(flightList.containsKey(flightEntity.getFlightId()))) {
            System.out.println("Flight already exists!");
        }
        return flightList.put(flightEntity.getFlightId(), flightEntity);
    }

    @Override
    public FlightEntity update(FlightEntity flightEntity) {
        int choise = inputUtil.getInteger("""
                Enter the Flight field you want to change!
                1.FlightId
                2.DeparturPoint
                3.ArrivalPoint
                4.DeparturTime
                5.ArrivalTime
                6.Totalseats
                7.AvailableSets""");
        switch (choise) {
            case 1 -> flightEntity.setFlightId(inputUtil.getString("Enter the new FlightId"));
            case 2 -> flightEntity.setDeparturPoint(inputUtil.getString("Enter the new Flight DeparturPoint"));
            case 3 -> flightEntity.setArrivalPoint(inputUtil.getString("Enter the new Flight ArrivalPoint"));
            case 4 ->
                    flightEntity.setDeparturTime(LocalDateTime.parse(inputUtil.getString("Enter the new Flight DeparturTime")));
            case 5 ->
                    flightEntity.setArrivalTime(LocalDateTime.parse(inputUtil.getString("Enter the new Flight ArrivalTime"),
                            DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            case 6 -> flightEntity.setTotalSeats(inputUtil.getInteger("Enter the new Flight TotalSeats"));
            case 7 -> flightEntity.setAvailableSets(inputUtil.getInteger("Enter the new Flight AvailableSeats"));
            default -> System.out.println("Invalid Input");
        }
        flightList.put(flightEntity.getFlightId(), flightEntity);
        return flightEntity;
    }

    @Override
    public FlightEntity delete(String flightID) {
        if (!(flightList.containsKey(flightID))) {
            System.out.println("Flight with Id " + flightID + " is not found!");
            return null;
        } else {
            System.out.println("Flight with Id " + flightID + " has been deleted!");
            return flightList.remove(flightID);

        }
    }

    @Override
    public Collection<FlightEntity> getAll() {
        return flightList.values();
    }

    @Override
    public Optional<FlightEntity> getById(String flightId) {
        return Optional.ofNullable(flightList.get(flightId));
    }
}
