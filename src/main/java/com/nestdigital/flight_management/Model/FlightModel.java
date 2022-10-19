package com.nestdigital.flight_management.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FlightModel {
    @Id
    @GeneratedValue
    private int id;
    private String flightname;
    private String origin;
    private String designation;
    private String capacity;

    public FlightModel() {
    }

    public FlightModel(int id, String flightname, String origin, String designation, String capacity) {
        this.id = id;
        this.flightname = flightname;
        this.origin = origin;
        this.designation = designation;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
