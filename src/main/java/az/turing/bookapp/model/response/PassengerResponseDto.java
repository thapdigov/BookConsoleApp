package az.turing.bookapp.model.response;

public class PassengerResponseDto {

    private final String passengerName;
    private final String passengerSurname;

    public PassengerResponseDto(String passengerName, String passengerSurname) {
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
    }
}
