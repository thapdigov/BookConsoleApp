package az.turing.bookapp.domain.entity;

public class PassengerEntity {
    private String passengerId;
    private String passengerName;
    private String passengerSurname;

    public PassengerEntity() {
    }

    public PassengerEntity(String passengerId) {
        this.passengerId = passengerId;
    }

    public PassengerEntity(String passengerId, String passengerName, String passengerSurname) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    @Override
    public String toString() {
        return "Passenger - passengerId: %s, passengerName: %s, passengerSurname: %s"
                .formatted(passengerId, passengerName, passengerSurname);


    }
}