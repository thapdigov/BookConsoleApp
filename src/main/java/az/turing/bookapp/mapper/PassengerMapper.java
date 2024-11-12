package az.turing.bookapp.mapper;

import az.turing.bookapp.domain.entity.PassengerEntity;
import az.turing.bookapp.model.request.PassengerRequestDto;

public class PassengerMapper implements EntityMapper<PassengerEntity, PassengerRequestDto> {

    @Override
    public PassengerEntity toEntity(PassengerRequestDto passengerRequestDto) {
        return new PassengerEntity(
                passengerRequestDto.getPassengerId(),
                passengerRequestDto.getPassengerName(),
                passengerRequestDto.getPassengerSurname());
    }

    @Override
    public PassengerRequestDto toDto(PassengerEntity passengerEntity) {
        return new PassengerRequestDto(
                passengerEntity.getPassengerId(),
                passengerEntity.getPassengerName(),
                passengerEntity.getPassengerSurname());
    }
}
