package com.example.airlineticketingserviceapp.service;

import com.example.airlineticketingserviceapp.dto.AirplaneDtoIn;
import com.example.airlineticketingserviceapp.model.Airplane;

public interface AirplaneService {

    public Airplane addAirplane(AirplaneDtoIn airplane);
}
