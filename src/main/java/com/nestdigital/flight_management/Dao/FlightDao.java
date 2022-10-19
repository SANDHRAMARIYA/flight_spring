package com.nestdigital.flight_management.Dao;

import com.nestdigital.flight_management.Model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
