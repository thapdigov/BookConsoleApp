package az.turing.bookapp.service;

import az.turing.bookapp.model.request.PassengerRequestDto;
import az.turing.bookapp.model.response.PassengerResponseDto;

public interface PassengerService {

    PassengerResponseDto create(PassengerRequestDto passengerRequestDto);

}
