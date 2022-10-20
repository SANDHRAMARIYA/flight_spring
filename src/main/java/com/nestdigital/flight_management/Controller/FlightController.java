package com.nestdigital.flight_management.Controller;

import com.nestdigital.flight_management.Dao.FlightDao;
import com.nestdigital.flight_management.Model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController

public class FlightController {

@Autowired
private FlightDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addflight",consumes = "application/json",produces = "application/json")
    public String viewflight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save(flight);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewflight")
    public List<FlightModel> allflight(){
        return (List<FlightModel>) dao.findAll();
    }

    @Transactional
@CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteflight",consumes = "application/json",produces = "application/json")
    public String deleteflight(@RequestBody FlightModel flight) {
        dao.deleteFlightById(flight.getId());
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchflight",consumes = "application/json",produces = "application/json")
    public List<FlightModel> searchflight(@RequestBody FlightModel flight){
        return (List<FlightModel>) dao.searchflight(flight.getOrigin());
    }
}
