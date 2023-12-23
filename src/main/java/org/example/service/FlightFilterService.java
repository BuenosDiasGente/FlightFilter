package org.example.service;

import org.example.model.Flight;

import java.util.List;

/**
 * Filter pattern
 */
public interface FlightFilterService {
    List<Flight> filter(List<Flight> flightList);
}
