package az.turing.bookapp.service;

import az.turing.bookapp.domain.dao.inter.PassengerDao;
import az.turing.bookapp.domain.entity.PassengerEntity;
import az.turing.bookapp.exception.AlreadyPassengerException;
import az.turing.bookapp.mapper.PassengerMapper;
import az.turing.bookapp.model.request.PassengerRequestDto;
import az.turing.bookapp.model.response.PassengerResponseDto;

public class PassengerServiceImpl implements PassengerService {

    private final PassengerDao passengerDao;
    private final PassengerMapper passengerMapper;

    public PassengerServiceImpl(PassengerDao passengerDao, PassengerMapper passengerMapper) {
        this.passengerDao = passengerDao;
        this.passengerMapper = passengerMapper;
    }

    @Override
    public PassengerResponseDto create(PassengerRequestDto passengerRequestDto) {
        if (passengerDao.existsById(passengerRequestDto.getPassengerId())) {
            throw new AlreadyPassengerException("Passenger is already contains with Id " + passengerRequestDto.getPassengerId());
        }
        PassengerEntity savedPassengerEntity = passengerDao
                .insert(passengerMapper.toEntity(passengerRequestDto));

        return new PassengerResponseDto(savedPassengerEntity.getPassengerName(), savedPassengerEntity.getPassengerSurname());
    }
}
