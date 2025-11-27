package com.example.airlineticketingserviceapp.service;

import com.example.airlineticketingserviceapp.dto.AirplaneDtoIn;
import com.example.airlineticketingserviceapp.model.Airplane;
import com.example.airlineticketingserviceapp.repository.AirplaneRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class JpaAirplaneService implements AirplaneService {

    private final AirplaneRepository airplaneRepository;

    public JpaAirplaneService(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    @Override
    public Airplane addAirplane(AirplaneDtoIn airplaneDTO) {
        Airplane newAirplane = new Airplane();
        newAirplane.setName(airplaneDTO.name());
        newAirplane.setCapacity(airplaneDTO.capacity());
        newAirplane.setRegistrationNo(airplaneDTO.registrationNumber());
        return airplaneRepository.save(newAirplane);
    }
}
