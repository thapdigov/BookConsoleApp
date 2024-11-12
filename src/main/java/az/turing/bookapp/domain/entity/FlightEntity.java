package az.turing.bookapp.domain.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FlightEntity {

    private String flightId;
    private String departurPoint;
    private String arrivalPoint;
    private LocalDateTime departurTime;
    private LocalDateTime arrivalTime;
    private Integer totalSeats;
    private Integer availableSets;

    public FlightEntity() {
    }

    public FlightEntity(String flightId) {
        this.flightId = flightId;
    }

    public FlightEntity(String flightId, String departurPoint, String arrivalPoint, String departurTime, String arrivalTime, Integer totalSeats, Integer availableSets) {
        this.flightId = flightId;
        this.departurPoint = departurPoint;
        this.arrivalPoint = arrivalPoint;
        this.departurTime = LocalDateTime.parse(departurTime, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.arrivalTime = LocalDateTime.parse(arrivalTime, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.totalSeats = totalSeats;
        this.availableSets = availableSets;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDeparturPoint() {
        return departurPoint;
    }

    public void setDeparturPoint(String departurPoint) {
        this.departurPoint = departurPoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public LocalDateTime getDeparturTime() {
        return departurTime;
    }

    public void setDeparturTime(LocalDateTime departurTime) {
        this.departurTime = departurTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getAvailableSets() {
        return availableSets;
    }

    public void setAvailableSets(Integer availableSets) {
        this.availableSets = availableSets;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightEntity that = (FlightEntity) o;
        return flightId.equals(that.flightId) && departurPoint.equals(that.departurPoint) && Objects.equals(arrivalPoint, that.arrivalPoint) && Objects.equals(departurTime, that.departurTime) && Objects.equals(arrivalTime, that.arrivalTime) && Objects.equals(totalSeats, that.totalSeats) && Objects.equals(availableSets, that.availableSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, departurPoint, arrivalPoint, departurTime, arrivalTime, totalSeats, availableSets);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", departurPoint='" + departurPoint +
                ", arrivalPoint='" + arrivalPoint +
                ", departurTime=" + departurTime +
                ", arrivalTime=" + arrivalTime +
                ", totalSeats=" + totalSeats +
                ", availableSets=" + availableSets +
                '}';
    }


}

