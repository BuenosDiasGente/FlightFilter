package org.example.service.impl;

import org.example.model.Flight;
import org.example.model.Segment;
import org.example.service.FlightFilterService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DepartureFlightFilterServiceImpl implements FlightFilterService {
    /**
     * A filter that excludes departures
     * up to the current time from the test set of flights.
     *
     * @param flightList
     * @return
     */
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        List<Flight> flights=new ArrayList<>();
        for (Flight flight : flightList) {
            for (Segment seg : flight.getSegments()) {
                if (seg.getDepartureDate().isAfter(LocalDateTime.now())) {
                    flights.add(flight);
                } else {
                    break;
                }
            }
        }
        return flights;
    }
}