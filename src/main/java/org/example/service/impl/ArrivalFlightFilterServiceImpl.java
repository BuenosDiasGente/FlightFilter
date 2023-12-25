package org.example.service.impl;

import org.example.model.Flight;
import org.example.model.Segment;
import org.example.service.FlightFilterService;

import java.util.ArrayList;
import java.util.List;

public class ArrivalFlightFilterServiceImpl implements FlightFilterService {
    /**
     * A filter that excludes segments with an arrival date earlier
     * than the departure date from the test set of flights.
     *
     * @param flightList
     * @return
     */
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        List<Flight> flights = new ArrayList<>();
        for (Flight flight : flightList) {
            for (Segment seg : flight.getSegments())
                if (seg.getArrivalDate().isAfter(seg.getDepartureDate())) {
                    flights.add(flight);
                    break;
                }
        }
        return flights;
    }
}
