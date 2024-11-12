package az.turing.bookapp.model.request;

public class PassengerRequestDto {
    private String passengerId;
    private String passengerName;
    private String passengerSurname;

    public PassengerRequestDto(String passengerId, String passengerName, String passengerSurname) {
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
}
