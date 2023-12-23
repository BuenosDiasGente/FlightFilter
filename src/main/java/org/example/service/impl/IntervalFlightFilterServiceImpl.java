package org.example.service.impl;

import org.example.model.Flight;
import org.example.model.Segment;
import org.example.service.FlightFilterService;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class IntervalFlightFilterServiceImpl implements FlightFilterService {
    /**
     * A filter that Excludes flights from the test set where the total time
     * spent on the ground exceeds two hours (time on the ground is the interval
     * between the arrival of one segment and the departure of the next one).
     *
     * @param flightList
     * @return
     */
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        List<Flight> flights=new ArrayList<>();
        for (Flight flight : flightList) {
            for (Segment seg : flight.getSegments()) {
                LocalDateTime arrivalDate = seg.getArrivalDate();
                LocalDateTime departureDate = seg.getDepartureDate();
                if (ChronoUnit.HOURS.between(arrivalDate, departureDate) < 2) {
                    flights.add(flight);
                } else {
                    break;
                }
            }
        }
        return flights;
    }
}
