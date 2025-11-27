package com.example.airlineticketingserviceapp.controller;


import com.example.airlineticketingserviceapp.dto.AirplaneDtoIn;
import com.example.airlineticketingserviceapp.dto.AirplaneDtoOut;
import com.example.airlineticketingserviceapp.model.Airplane;
import com.example.airlineticketingserviceapp.service.AirplaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/airplanes")
public class AirplaneController {
    private final AirplaneService airplaneService;
    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @PostMapping("")
    public ResponseEntity<AirplaneDtoOut> createAirplane(@RequestBody AirplaneDtoIn airplaneDtoIn) {
        final Airplane airplane = airplaneService.addAirplane(airplaneDtoIn);
        AirplaneDtoOut airplaneDtoOut =
                new AirplaneDtoOut(airplane.getId(),airplane.getName(),
                        airplane.getCapacity(), airplane.getRegistrationNo());
        return ResponseEntity.status(HttpStatus.CREATED).body(airplaneDtoOut);
    }


}
